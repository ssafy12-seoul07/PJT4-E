package com.ssafit.dto;

public class Review {
    private int id;
    private String videoId;
    private String content;
    private String userId;
    
    
	public Review(int id, String videoId, String content, String userId) {
		super();
		this.id = id;
		this.videoId = videoId;
		this.content = content;
		this.userId = userId;
	}
	
	public Review() {
		// TODO Auto-generated constructor stub
	}
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getVideoId() { return videoId; }
    public void setVideoId(String videoId) { this.videoId = videoId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
