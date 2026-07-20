package com.cognizant.employeerest.service;

import com.cognizant.employeerest.dao.EmployeeDao;
import com.cognizant.employeerest.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public ArrayList<Employee> getAllEmployees() {

        return employeeDao.getAllEmployees();

    }

}