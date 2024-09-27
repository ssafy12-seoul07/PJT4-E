package com.ssafit.repository;

import com.ssafit.dto.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository {
    private static Repository instance;
    private List<Review> reviews = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();;
    private int vidCounter = 1;
    
    public void addVideo(Video video) {
    	video.setId(vidCounter++);
        videos.add(video);
    }

 // 모든 비디오 가져오기
    public List<Video> getAllVideos() {
        return new ArrayList<>(videos);
    }

    // ID로 비디오 찾기
    public Optional<Video> getVideoById(int id) {
        return videos.stream()
                     .filter(video -> video.getId() == id)
                     .findFirst();
    }

    // 비디오 수정
    public boolean updateVideo(int id, Video updatedVideo) {
        Optional<Video> optionalVideo = getVideoById(id);
        if (optionalVideo.isPresent()) {
            Video existingVideo = optionalVideo.get();
            existingVideo.setTitle(updatedVideo.getTitle());
            existingVideo.setDescription(updatedVideo.getDescription());
            existingVideo.setCategory(updatedVideo.getCategory());
            existingVideo.setViews(updatedVideo.getViews());
            return true; // 수정 성공
        }
        return false; // 비디오를 찾을 수 없음
    }

    // 비디오 삭제
    public boolean removeVideo(int id) {
        return videos.removeIf(video -> video.getId() == id);
    }
    private int ridCounter = 1;
    
    private Repository() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public List<Review> findAllR() {
        return new ArrayList<>(reviews);
    }

    public void save(Review review) {
        review.setId(ridCounter++);
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