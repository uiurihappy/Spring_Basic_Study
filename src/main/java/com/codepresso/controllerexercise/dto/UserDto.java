package com.codepresso.controllerexercise.dto;
import java.util.List;

public class UserDto {
    Long id;
    String name;
    String email;
    List<SpecialtyDto> specialties;

    public UserDto(Long id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}
