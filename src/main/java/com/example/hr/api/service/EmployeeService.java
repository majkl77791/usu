package com.example.hr.api.service;

import com.example.hr.api.dto.EmployeeStatisticDto;
import com.example.hr.api.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    List<EmployeeStatisticDto> getStatistic();

    Employee findById(int Id);

    Employee save(Employee employee);

    void deleteById(int id);
}
