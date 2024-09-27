package com.ssafit.dao;

import com.ssafit.dto.Review;

import java.util.List;

public interface Reviewdao {

    public List<Review> getReviewsByVideoId(int videoId);

    public void addReview(Review review);

    public void updateReview(Review review);

    public void deleteReview(int id);
    
}
