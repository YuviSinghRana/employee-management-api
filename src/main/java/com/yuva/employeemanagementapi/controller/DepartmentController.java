package com.yuva.employeemanagementapi.controller;

import com.yuva.employeemanagementapi.model.Department;
import com.yuva.employeemanagementapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/listDepartments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/{Id}")
    public Department getDepartmentById(@PathVariable Long Id){
        return departmentService.getDepartmentById(Id);
    }

    @PostMapping("/addDepartment")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PutMapping("/updateDepartment/{Id}")
    public Department updateDepartmentById(@PathVariable Long Id,@RequestBody Department department){
        return departmentService.updateDepartmentById(Id,department);
    }

    @DeleteMapping("/deleteDepartment/{Id}")
    public String deleteDepartmentById(@PathVariable Long Id){
        return departmentService.deleteDepartmentById(Id);
    }

}
