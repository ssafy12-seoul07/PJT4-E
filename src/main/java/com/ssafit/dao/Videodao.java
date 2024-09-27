package com.ssafit.dao;

import java.util.List;

import com.ssafit.dto.Video;

public interface Videodao {

    public void addVideo(Video video);

    public List<Video> getAllVideos();

    public boolean updateVideo(int id, Video updatedVideo);

    public boolean removeVideo(int id);
}