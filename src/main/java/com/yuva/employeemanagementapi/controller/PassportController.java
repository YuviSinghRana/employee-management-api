package com.yuva.employeemanagementapi.controller;

import com.yuva.employeemanagementapi.model.Passport;
import com.yuva.employeemanagementapi.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @GetMapping("/listPassport")
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    }

    @GetMapping("/{Id}")
    public Passport getPassportById(@PathVariable Long Id){
        return passportService.getPassportById(Id);
    }

}
