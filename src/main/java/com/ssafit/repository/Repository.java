package com.ssafit.repository;

import com.ssafit.dto.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository {
    private static Repository instance;
    private static List<Review> reviews = new ArrayList<>();
    private static List<Video> videos = new ArrayList<>();;
    
    public void addVideo(Video video) {
        videos.add(video);
    }

 // 모든 비디오 가져오기
    public List<Video> getAllVideos() {
        return new ArrayList<>(videos);
    }

    // ID로 비디오 찾기
    public Video getVideoById(String id) {
        return videos.stream()
                     .filter(video -> video.getId().equals(id))
                     .findFirst()
                     .orElse(null);
    }


    // 비디오 삭제
    public boolean removeVideo(String id) {
        return videos.removeIf(video -> video.getId().equals(id));
    }
    
    private Repository() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Repository getInstance() {
        if (instance == null) {
        	Video video1 = new Video("u5OgcZdNbMo", "저는 하체 식주의자 입니다", "GYM종국", "하체", 3);
        	Video video2 = new Video("MTU4iCDntjs?si=fpAPThN64woRE2Uj", "4 Minute OFFICE STRETCHING(full body)", "Allblanc TV", "전신", 3);
        	Video video3 = new Video("IG50fc8n56E?si=1x1PSzD_BwgQcsrs", "죄와 벌", "피승빈", "드라마", 3);
            videos.add(video1);
            videos.add(video2);
            videos.add(video3);
            instance = new Repository();
        }
        return instance;
    }

    public List<Review> findAllR() {
        return new ArrayList<>(reviews);
    }

    public void save(Review review) {
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