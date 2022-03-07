package com.yuva.employeemanagementapi.service.impl;

import com.yuva.employeemanagementapi.model.Employee;
import com.yuva.employeemanagementapi.repository.EmployeeRepository;
import com.yuva.employeemanagementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeById(Long Id,Employee employeeDetails){
        try{
            Employee employee = getEmployeeById(Id);
            System.out.println(employee.getName());
            if(employee!=null){
                if(employeeDetails.getName()!=null){
                    employee.setName(employeeDetails.getName());
                }
                if(employeeDetails.getDesignation()!=null){
                    employee.setDesignation(employeeDetails.getDesignation());
                }
                if(employeeDetails.getAge()!=0){
                    employee.setAge(employeeDetails.getAge());
                }
                employeeRepository.save(employee);
                System.out.println("Employee Details Updated");
            }
            return employeeRepository.getById(Id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public String deleteEmployeeById(Long Id){
        try{
            Employee employee = getEmployeeById(Id);
            System.out.println(employee.getName());
            employeeRepository.delete(employee);
            System.out.println("Employee Deleted!");
            return "Employee Deleted!";
        }catch(EntityNotFoundException e){
            return "Employee Not Found!";
        }
    }
}
