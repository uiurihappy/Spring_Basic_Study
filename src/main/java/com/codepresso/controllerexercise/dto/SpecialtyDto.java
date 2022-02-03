package com.codepresso.controllerexercise.dto;

public class SpecialtyDto {
    String name;
    String level;

    public SpecialtyDto(String name, String level) {
        this.name = name;
        this.level = level;
    }
    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
