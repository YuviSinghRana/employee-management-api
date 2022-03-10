package com.yuva.employeemanagementapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private String Designation;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "passport_id", referencedColumnName = "passport_id")
    @JsonManagedReference
    private Passport passport;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Review> reviews;

    @UpdateTimestamp
    @GeneratedValue
    private LocalDateTime lastUpdated;

    @CreationTimestamp
    @GeneratedValue
    private LocalDateTime createdDate;


    public Employee() {
    }

    public Employee(String name, int age, String designation, Passport passport, List<Review> reviews, LocalDateTime lastUpdated, LocalDateTime createdDate) {
        this.name = name;
        this.age = age;
        Designation = designation;
        this.passport = passport;
        this.reviews = reviews;
        this.lastUpdated = lastUpdated;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public void removeReview(Review review) {
        this.reviews.remove(review);
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Designation='" + Designation + '\'' +
                ", passport=" + passport +
                ", reviews=" + reviews +
                ", lastUpdated=" + lastUpdated +
                ", createdDate=" + createdDate +
                '}';
    }
}
