package com.codepresso.controllerexercise.controller;

import com.codepresso.controllerexercise.dto.PostDto;
import com.codepresso.controllerexercise.service.PostService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public PostDto getPost(@RequestParam Long id){
        PostDto result = postService.getPost(id);
        return result;
    }

    @PostMapping
    public String savePost(@RequestBody PostDto postDto){
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());

        return "POST /post";
    }

    @PutMapping
    public String updatePost(){
        return "PUT /post";
    }

    @DeleteMapping
    public String deletePost(){
        return "DELETE /post";
    }

}
