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
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)

// Main class
class DeleteEmployeeTest {

    @Mock
    private EmployeeDAO employeeDAO;


    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    void deleteEmployeeOK()
    {

        Employee employee1= new Employee( "Michal Zabka",33,"programmer");

        given(employeeDAO.findById(employee1.getId()))
                .willReturn(employee1);
        employeeService.deleteById(employee1.getId());
        verify(employeeDAO, times(1)).deleteById(0);
    }
}

