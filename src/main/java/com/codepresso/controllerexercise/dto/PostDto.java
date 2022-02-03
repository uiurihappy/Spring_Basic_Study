package com.codepresso.controllerexercise.dto;

import org.springframework.web.bind.annotation.ResponseBody;

public class PostDto {
    Long id;
    String title;
    String content;
    String username;

    public PostDto(Long id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }
}
