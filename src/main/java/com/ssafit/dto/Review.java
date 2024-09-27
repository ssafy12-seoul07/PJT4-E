package com.ssafit.dto;

public class Review {
    private int id;
    private int videoId;
    private String content;
    private String userId;
    
    
	public Review(int id, int videoId, String content, String userId) {
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

    public int getVideoId() { return videoId; }
    public void setVideoId(int videoId) { this.videoId = videoId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
