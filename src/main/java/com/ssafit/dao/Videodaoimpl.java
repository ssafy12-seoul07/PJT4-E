package com.ssafit.dao;

import java.util.List;

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

    public boolean updateVideo(int id, Video updatedVideo) {
        return videos.updateVideo(id, updatedVideo);
    }

    public boolean removeVideo(int id) {
        return videos.removeVideo(id);
    }
}