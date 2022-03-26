package com.javaee9.javaee9finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data //need all the getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    String header;
    String postText;
    String author;
    ZonedDateTime creationTimestamp;
    ZonedDateTime updateTimestamp;
}
