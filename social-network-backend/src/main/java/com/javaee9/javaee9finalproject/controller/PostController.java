package com.javaee9.javaee9finalproject.controller;

import com.javaee9.javaee9finalproject.dto.PostDto;
import com.javaee9.javaee9finalproject.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // /raedRecentPosts - never every!!!!
    // /posts?boundary= vs /posts/recent
    @GetMapping("/recent")
    public List<PostDto> readRecentPosts() {
        log.info("reading recent posts");

        return postService.readRecentPosts();
    }

    @GetMapping("recent/{id}")
    public PostDto findPostById(@PathVariable("id") Long postId) {
        // todo: finish implementation
        // 1. read Post by id form database
        // 2. convert Post ingo PostDto
        // 3. return to user
        return new PostDto(1L,
                "header",
                "Content",
                "me",
                "1998",
                "1988");
    }

    // TODO: validation
    @PostMapping
    public PostDto createNewPost(@RequestBody PostDto toStore){ //Spring is trying to read that json
        //if you don't have the @RequestBody annotation, Spring does not know where to save the object you passed from Postman.
        // Therefore, you are not using the received json at all, but rather uses an empty object.
        log.info("trying to store new post: [{}]", toStore);

       return postService.createNewPost(toStore);
    }
}
