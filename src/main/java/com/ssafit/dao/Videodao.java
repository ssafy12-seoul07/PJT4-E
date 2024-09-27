package com.ssafit.dao;

import java.util.List;

import com.ssafit.dto.Video;

public interface Videodao {

    public void addVideo(Video video);

    public List<Video> getAllVideos();

    public Video findById(String id);
    
    public void updateVideo(String id, Video updatedVideo);

    public boolean removeVideo(String id);
}