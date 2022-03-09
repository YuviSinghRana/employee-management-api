package com.yuva.employeemanagementapi.repository;

import com.yuva.employeemanagementapi.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
