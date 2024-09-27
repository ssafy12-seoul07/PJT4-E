package com.ssafit.repository;

import com.ssafit.dto.Review;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository instance;
    private List<Review> reviews = new ArrayList<>();
    private int idCounter = 1;

    private Repository() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public List<Review> findAll() {
        return new ArrayList<>(reviews);
    }

    public void save(Review review) {
        review.setId(idCounter++);
        reviews.add(review);
    }

    public Review findById(int id) {
        return reviews.stream()
                .filter(r -> r.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void deleteById(int id) {
        reviews.removeIf(review -> review.getId() == id);
    }
}