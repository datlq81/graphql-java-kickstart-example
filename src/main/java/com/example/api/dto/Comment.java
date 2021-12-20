package com.example.api.dto;

import lombok.Value;

@Value
public class Comment {
	Long postId;
	Long id;
	String name;
	String email;
	String body;
}
