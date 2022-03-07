package com.yuva.employeemanagementapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Passport {
    @Id
    @GeneratedValue
    @Column(name = "passport_id")
    private Long passportID;
    @Column(name = "passport_number")
    private String passportNumber;
    @OneToOne(mappedBy = "passport")
    private Employee employee;
    @UpdateTimestamp
    @GeneratedValue
    private LocalDateTime lastUpdated;
    @CreationTimestamp
    @GeneratedValue
    private LocalDateTime createdDate;

    public Passport() {
    }

    public Passport(String passportNumber, Employee employee, LocalDateTime lastUpdated, LocalDateTime createdDate) {
        this.passportNumber = passportNumber;
        this.lastUpdated = lastUpdated;
        this.createdDate = createdDate;
    }

    public Long getPassportID() {
        return passportID;
    }

    public void setPassportID(Long passportID) {
        this.passportID = passportID;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getlastUpdated() {
        return lastUpdated;
    }

    public void setlastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportID=" + passportID +
                ", passportNumber='" + passportNumber + '\'' +
                ", employee=" + employee +
                ", lastUpdated=" + lastUpdated +
                ", createdDate=" + createdDate +
                '}';
    }
}

