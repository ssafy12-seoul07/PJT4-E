package com.ssafit.dao;

import java.util.List;

import com.ssafit.dto.Review;
import com.ssafit.dto.Video;
import com.ssafit.repository.*;

public class Videodaoimpl implements Videodao {
    private Repository videos = Repository.getInstance();

    public void addVideo(Video video) {
        videos.addVideo(video);
    }

    public List<Video> getAllVideos() {
        return videos.getAllVideos();
    }
    
    public Video findById(String id) {
    	return videos.getVideoById(id);
    }

    public void updateVideo(String id, Video updatedVideo) {
    	Video existingVideo = videos.getVideoById(id);
        if (existingVideo != null) {
        	existingVideo.setTitle(updatedVideo.getTitle());
            existingVideo.setDescription(updatedVideo.getDescription());
            existingVideo.setCategory(updatedVideo.getCategory());
            existingVideo.setViews(updatedVideo.getViews());
        }
    }

    public boolean removeVideo(String id) {
        return videos.removeVideo(id);
    }
}