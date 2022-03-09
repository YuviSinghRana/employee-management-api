package com.yuva.employeemanagementapi.service.impl;

import com.yuva.employeemanagementapi.model.Review;
import com.yuva.employeemanagementapi.repository.ReviewRepository;
import com.yuva.employeemanagementapi.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewsById(Long Id) {
        return reviewRepository.getById(Id);
    }
}
