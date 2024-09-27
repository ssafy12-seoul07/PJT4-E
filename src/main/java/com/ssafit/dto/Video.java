package com.ssafit.dto;

public class Video {
	private String id;
    private String title;
    private String description;
    private String category;
    private int views;
	
	public Video(String id, String title, String description, String category, int views) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.views = views;
	}

	public Video() {
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getViews() { return views; }
    public void setViews(int views) { this.views = views; }
	
}
