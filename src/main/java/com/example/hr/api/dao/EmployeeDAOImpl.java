package com.example.hr.api.dao;

import com.example.hr.api.dto.EmployeeStatisticDto;
import com.example.hr.api.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public List<EmployeeStatisticDto> getStatistic() {
        Query query = entityManager.createNativeQuery("SELECT \n" +
                "    position, \n" +
                "    COUNT(*) AS EmployeeCount, \n" +
                "    AVG(Age) AS AverageAge\n" +
                "FROM \n" +
                "    Employee\n" +
                "GROUP BY \n" +
                "    position\n" +
                "ORDER BY \n" +
                "    EmployeeCount DESC", EmployeeStatisticDto.class);

        List<EmployeeStatisticDto> resultList = query.getResultList();

        return resultList;
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);

    }
}
