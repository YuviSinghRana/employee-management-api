package com.yuva.employeemanagementapi.repository;

import com.yuva.employeemanagementapi.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}
