package com.social.network.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {
	
	private LocalDateTime Moment; 
	private String Title; 
	private String Content; 
	private int Likes; 
	
	private ArrayList<Comment> Comments = new ArrayList<>(); 
	
	public Post() { 
		
	}

	public Post(LocalDateTime moment, String title, String content, int likes) {
	
		Moment = moment;
		Title = title;
		Content = content;
		Likes = likes;
	}
	
	public void AddComment(Comment comment) {
		Comments.add(comment); 
	}
	
	public void RemoveComment(Comment comment) {
		Comments.remove(comment); 
	}

	@Override
	public String toString() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
		
		StringBuilder sb = new StringBuilder();
		sb.append(Title + "\n"); 
		sb.append(Likes + " Likes - " +Moment.format(fmt) + "\n");
		sb.append(Content + "\n"); 
		sb.append("Comments: \n"); 
		for (Comment c : Comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
	
	
}
