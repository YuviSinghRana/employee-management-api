package com.yuva.employeemanagementapi.service;

import com.yuva.employeemanagementapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(Long Id);
    Employee updateEmployeeById(Long Id,Employee employeeDetails);
    String deleteEmployeeById(Long Id);
}
