package com.yuva.employeemanagementapi.repository;

import com.yuva.employeemanagementapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
