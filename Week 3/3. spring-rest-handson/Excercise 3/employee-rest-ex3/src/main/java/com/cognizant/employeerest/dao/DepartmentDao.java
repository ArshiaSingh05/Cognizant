package com.cognizant.employeerest.dao;

import com.cognizant.employeerest.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DepartmentDao {

    private static ArrayList<Department> DEPARTMENT_LIST;

    public DepartmentDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        DEPARTMENT_LIST =
                context.getBean("departmentList", ArrayList.class);

        ((ClassPathXmlApplicationContext) context).close();

    }

    public ArrayList<Department> getAllDepartments() {

        return DEPARTMENT_LIST;

    }

}