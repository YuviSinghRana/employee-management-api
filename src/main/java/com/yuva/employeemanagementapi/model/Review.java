package com.yuva.employeemanagementapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "review")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int rating;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Employee employee;

    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    @CreationTimestamp
    private LocalDateTime createdDate;

    public Review() {
    }

    public Review(int rating, String description, Employee employee, LocalDateTime lastUpdated, LocalDateTime createdDate) {
        this.rating = rating;
        this.description = description;
        this.employee = employee;
        this.lastUpdated = lastUpdated;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", description='" + description + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", createdDate=" + createdDate +
                '}';
    }
}
