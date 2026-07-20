package com.cognizant.employeerest.service;

import com.cognizant.employeerest.dao.DepartmentDao;
import com.cognizant.employeerest.model.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;

    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public ArrayList<Department> getAllDepartments() {

        return departmentDao.getAllDepartments();

    }

}