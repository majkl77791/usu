package com.example.hr;

import com.example.hr.api.dao.EmployeeDAO;
import com.example.hr.api.entity.Employee;
import com.example.hr.api.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)

// Main class
class GetEmployeesTest {

    @Mock
    private EmployeeDAO employeeDAO;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    void getAllEmployeesOK()
    {
        //given
        Employee employee1= new Employee( "Michal Zabka",33,"programmer");
        Employee employee2 = new Employee("Petr Brodik",55,"programmer");
        //When
        given(employeeDAO.findAll())
                .willReturn(List.of(employee1, employee2));
        List<Employee> employeeList = employeeService.findAll();
        //Then
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }
}

