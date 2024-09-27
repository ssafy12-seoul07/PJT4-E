package com.ssafit.dao;

import com.ssafit.dto.Review;

import java.util.List;

public interface Reviewdao {

    public List<Review> getReviewsByVideoId(String videoId);

    public void addReview(Review review);

    public Review findReviewById(int id);
    
    public void updateReview(Review review);

    public void deleteReview(int id);
    
}
