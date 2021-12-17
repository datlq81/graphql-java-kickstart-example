package com.example.api.model;

import lombok.Value;

@Value
public class Post {

    Long id;
    Long userId;
    String title;
    String body;

}
