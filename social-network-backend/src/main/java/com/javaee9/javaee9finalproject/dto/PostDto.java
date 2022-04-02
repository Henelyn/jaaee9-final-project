package com.javaee9.javaee9finalproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PostDto(Long id, //json will have the same keys with the values
                      String header,
                      String content,
                      String author,
                      @JsonProperty("creation_timestamp") //
                      String creationTimestamp,
                      @JsonProperty("update_timestamp")
                      String updateTimestamp) {
}
