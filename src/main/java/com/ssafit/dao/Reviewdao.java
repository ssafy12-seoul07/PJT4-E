package com.ssafit.dao;

import com.ssafit.dto.Review;
import com.ssafit.repository.*;

import java.util.ArrayList;
import java.util.List;

public class Reviewdao {
    private Repository reviews = Repository.getInstance();

    public List<Review> getReviewsByVideoId(int videoId) {
        List<Review> videoReviews = new ArrayList<>();
        for (Review review : reviews.findAll()) {
            if (review.getVideoId() == videoId) {
                videoReviews.add(review);
            }
        }
        return videoReviews;
    }

    public void addReview(Review review) {
    	reviews.save(review);
    }

    public void updateReview(Review review) {
        Review existingReview = reviews.findById(review.getId());
        if (existingReview != null) {
            existingReview.setContent(review.getContent());
        }
    }

    public void deleteReview(int id) {
    	reviews.deleteById(id);
    }
}
