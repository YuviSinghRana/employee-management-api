package com.yuva.employeemanagementapi.service.impl;

import com.yuva.employeemanagementapi.model.Passport;
import com.yuva.employeemanagementapi.repository.PassportRepository;
import com.yuva.employeemanagementapi.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassportServiceImpl implements PassportService {

    @Autowired
    PassportRepository passportRepository;

    @Override
    public List<Passport> getAllPassport() {
        return passportRepository.findAll();
    }

    @Override
    public Passport getPassportById(Long id){
        Optional<Passport> optionalPassport = passportRepository.findById(id);
        if(optionalPassport.isPresent()){
            return optionalPassport.get();
        }
        return null;
    }
}
