package com.surya;

import java.sql.SQLException;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.surya.extensions.EmployeeDaoParameterResolver;
import com.surya.extensions.EmployeeDatabaseSetupExtension;
import com.surya.extensions.EnvironmentExtension;
import com.surya.extensions.IgnoreFileNotFoundExceptionExtension;
import com.surya.extensions.LoggingExtension;
import com.surya.helpers.Employee;
import com.surya.helpers.EmployeeJdbcDao;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({ EnvironmentExtension.class, EmployeeDatabaseSetupExtension.class, EmployeeDaoParameterResolver.class })
@ExtendWith(LoggingExtension.class)
@ExtendWith(IgnoreFileNotFoundExceptionExtension.class)
public class EmployeesUnitTest {

    private EmployeeJdbcDao employeeDao;

    private Logger logger;

    public EmployeesUnitTest(EmployeeJdbcDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Test
    public void whenAddEmployee_thenGetEmployee() throws SQLException {
        Employee emp = new Employee(1, "john");
        employeeDao.add(emp);
        assertEquals(1, employeeDao.findAll()
            .size());
    }

    @Test
    public void whenGetEmployees_thenEmptyList() throws SQLException {
        assertEquals(0, employeeDao.findAll()
            .size());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
