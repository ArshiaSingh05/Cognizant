package com.cognizant.employeerest.dao;

import com.cognizant.employeerest.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST;

    public EmployeeDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        EMPLOYEE_LIST =
                context.getBean("employeeList", ArrayList.class);

        ((ClassPathXmlApplicationContext) context).close();

    }

    public ArrayList<Employee> getAllEmployees() {

        return EMPLOYEE_LIST;

    }

}