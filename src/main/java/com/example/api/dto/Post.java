package com.example.api.dto;

import lombok.Value;

@Value
public class Post {
    Long id;
    Long userId;
    String title;
    String body;

}
