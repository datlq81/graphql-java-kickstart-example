package com.example.api.dto;

import lombok.Value;

@Value
public class PostInput {
    Long userId;
    String title;
    String body;
}
