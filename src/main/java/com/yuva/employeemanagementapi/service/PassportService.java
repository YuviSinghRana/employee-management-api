package com.yuva.employeemanagementapi.service;

import com.yuva.employeemanagementapi.model.Passport;

import java.util.List;

public interface PassportService {

    List<Passport> getAllPassport();

    Passport getPassportById(Long id);
}
