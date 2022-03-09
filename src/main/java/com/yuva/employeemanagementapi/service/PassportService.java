package com.yuva.employeemanagementapi.service;

import com.yuva.employeemanagementapi.model.Passport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PassportService {

    List<Passport> getAllPassport();

    Passport getPassportById(Long id);
}
