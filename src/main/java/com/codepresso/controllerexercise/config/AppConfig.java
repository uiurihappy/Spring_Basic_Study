package com.codepresso.controllerexercise.config;

import com.codepresso.controllerexercise.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PostService postService(){
        //객체 생성과 동시에 return
        return new PostService();
    }
}
