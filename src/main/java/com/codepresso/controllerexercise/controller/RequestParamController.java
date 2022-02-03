package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping(value = "/post")
    public String getPost(@RequestParam(required = false, defaultValue = "it") String category,
                          @RequestParam Integer id){
        return "You requested " + category + " - " + id + "post";
    }
    @RequestMapping(value = "/user/{type}/id/{id}")
    public String getUser(@PathVariable(name = "type") String category,
                          @PathVariable(name = "id") Integer id){
        return "You requested " + category + " - " + id + "user";
    }
}
