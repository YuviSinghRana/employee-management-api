package com.yuva.employeemanagementapi.service;

import com.yuva.employeemanagementapi.model.Department;

import java.util.List;

public interface DepartmentService {
    Department getDepartmentById(Long Id);
    List<Department> getDepartments();
    Department addDepartment(Department department);
    Department updateDepartmentById(Long Id, Department departmentDetails);
    String deleteDepartmentById(Long Id);
}
