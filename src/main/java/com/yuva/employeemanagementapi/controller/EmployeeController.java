package com.yuva.employeemanagementapi.controller;

import com.yuva.employeemanagementapi.model.Employee;
import com.yuva.employeemanagementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/listEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployeeById")
    public Employee getEmployeeById(@PathVariable Long Id){
        return employeeService.getEmployeeById(Id);
    }

    @GetMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployeeById(@PathVariable Long Id,@RequestBody Employee employee){
        return employeeService.updateEmployeeById(Id,employee);
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployeeById(@PathVariable Long Id){
        return employeeService.deleteEmployeeById(Id);
    }
}
