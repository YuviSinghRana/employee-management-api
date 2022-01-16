package com.yuva.employeemanagementapi.service.impl;

import com.yuva.employeemanagementapi.model.Employee;
import com.yuva.employeemanagementapi.repository.EmployeeRepository;
import com.yuva.employeemanagementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long Id){
        return employeeRepository.getById(Id);
    }

    @Override
    public Employee addEmployee(Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public Employee updateEmployeeById(Long Id,Employee employeeDetails){
        Employee employee = getEmployeeById(Id);
        if(employee!=null){
            employee.setName(employeeDetails.getName());
            employee.setAge(employeeDetails.getAge());
            employee.setDesignation(employeeDetails.getDesignation());
            employeeRepository.save(employee);
            System.out.println("Employee Details Updated");
        }
        return employeeRepository.getById(Id);
    }

    @Override
    public String deleteEmployeeById(Long Id){
        Employee employee = getEmployeeById(Id);
        if(employee!=null){
            System.out.println("Employee Deleted!");
            employeeRepository.delete(employee);
            return "Employee Deleted!";
        }
        return "Employee Not Found!";
    }
}
