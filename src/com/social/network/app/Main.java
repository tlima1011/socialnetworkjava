package com.social.network.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.social.network.entities.*; 

import com.social.network.entities.Post;

public class Main {
	
	public static void main(String[] args) {
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Comment c3 = new Comment("Enjoy this trip!! ;)");
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Post p1 = new Post(
			    LocalDateTime.parse("21/06/2018 13:05:44", fmt), 
			    "Traveling to New Zealand",
			    "I'm going to visit this wonderful country",
			    12
			    );
		p1.AddComment(c1); 
		p1.AddComment(c2);
		p1.AddComment(c3);
		
		Post p2 = new Post(
				LocalDateTime.parse("28/07/2018 23:14:19",fmt),
				"Good Nigth Guys",
				"See you tomorrow",
				5
				);
		
		 Comment c4 = new Comment("Good Night");
		 Comment c5 = new Comment("May the force be with you!! :)");
		 Comment c6 = new Comment("Great!!!");
		 Comment c7 = new Comment("Wonderful!");
		
		p2.AddComment(c4);
		p2.AddComment(c5); 
		p2.AddComment(c6); 
		p2.AddComment(c7); 
		 
		System.out.println(p1);
		System.out.println(p2);
	
	}
}
