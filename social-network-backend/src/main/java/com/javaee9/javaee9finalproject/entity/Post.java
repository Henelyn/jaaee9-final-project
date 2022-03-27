package com.javaee9.javaee9finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Clock;
import java.time.ZonedDateTime;

@Data //need all the getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String header;
    String postText;
    String author;
    ZonedDateTime creationTimestamp;
    ZonedDateTime updateTimestamp;

    @PrePersist
    private void setInitialTimestamp(){
        ZonedDateTime timestamp = ZonedDateTime.now(Clock.systemUTC());
        creationTimestamp = timestamp;
        updateTimestamp = timestamp;
    }

    @PreUpdate
    private void setUpdateTimestamp(){
        updateTimestamp = ZonedDateTime.now();
    }
}
