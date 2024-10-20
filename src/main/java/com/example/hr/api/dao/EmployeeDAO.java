package com.example.hr.api.dao;

import com.example.hr.api.dto.EmployeeStatisticDto;
import com.example.hr.api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    List<EmployeeStatisticDto> getStatistic();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);



}
