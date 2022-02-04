package com.codepresso.controllerexercise.controller;

import com.codepresso.controllerexercise.dto.SpecialtyDto;
import com.codepresso.controllerexercise.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// @RequestMapping(value = "/user")
public class UserController {

//    @RequestMapping(value = "/paid")
//    public String getPaidUser(){
//        return "Im a paid user.";
//    }
//    @RequestMapping(value = "/enterprise")
//    public String getEnterpriseUser(){
//        return "Im a enterprise user.";
//    }
    @RequestMapping(value = "/user")
    public UserDto getUser(){
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Intermediate"));

        return new UserDto(1L, "Jin", "jin@codepresso.kr", specialties);
    }
}
