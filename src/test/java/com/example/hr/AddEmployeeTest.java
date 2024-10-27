package com.example.hr;

import com.example.hr.api.dao.EmployeeDAO;
import com.example.hr.api.entity.Employee;
import com.example.hr.api.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)

// Main class
class AddEmployeeTest {

    @Mock
    private EmployeeDAO employeeDAO;


    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    void addEmployeeOK()
    {
        //given
        Employee employee1= new Employee( "Michal Zabka",33,"programmer");

        //When
        given(employeeDAO.save(employee1))
                .willReturn(employee1);
        Employee employee = employeeService.save(employee1);
        //Then
        assertThat(employee).isNotNull();
        assertThat(employee1).isEqualTo(employee);
    }
}

