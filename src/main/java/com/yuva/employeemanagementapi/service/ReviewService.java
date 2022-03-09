package com.yuva.employeemanagementapi.service;

import com.yuva.employeemanagementapi.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewsById(Long Id);
}
