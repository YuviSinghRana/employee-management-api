package com.yuva.employeemanagementapi.service.impl;

import com.yuva.employeemanagementapi.model.Department;
import com.yuva.employeemanagementapi.repository.DepartmentRepository;
import com.yuva.employeemanagementapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department getDepartmentById(Long Id){
        return departmentRepository.getById(Id);
    }

    @Override
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartmentById(Long Id, Department departmentDetails){
        try{
            Department department = getDepartmentById(Id);
            if(department!=null){
                if(departmentDetails.getDeptName()!=null){
                    department.setDeptName(departmentDetails.getDeptName());
                }
                departmentRepository.save(department);

            }
            return departmentRepository.getById(Id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String deleteDepartmentById(Long Id){
        departmentRepository.deleteById(Id);
        return "Department Deleted with ID = "+Id;
    }
}
