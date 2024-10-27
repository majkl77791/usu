package com.example.hr.api.controller;

import com.example.hr.api.dao.EmployeeDAO;
import com.example.hr.api.dto.EmployeeStatisticDto;
import com.example.hr.api.entity.Employee;
import com.example.hr.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/statistic")
    public List<EmployeeStatisticDto> getStatistic() {
        return employeeService.getStatistic();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        employee.setId(0);
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {

        employeeService.deleteById(employeeId);
        return "Employee with id " + employeeId + " was deleted.";
    }


}
