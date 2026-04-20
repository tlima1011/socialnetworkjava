package com.social.network.entities;

import java.time.LocalDateTime;

public class Post {
	
	private LocalDateTime Moment; 
	private String Title; 
	private String Content; 
	private int Likes; 
	
	public Post() { 
		
	}

	public Post(LocalDateTime moment, String title, String content, int likes) {
	
		Moment = moment;
		Title = title;
		Content = content;
		Likes = likes;
	}
	
	
	
	

}
