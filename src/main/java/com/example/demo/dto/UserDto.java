package com.example.demo.dto;

import java.util.List;

/**
 * DTO (to communicate through the client)
 */
public class UserDto {

    private Integer userId;
    private String userName;
    private List<SkillDto> skillDtos;


    public UserDto(Integer userId, String userName, List<SkillDto> skillDtos) {
        this.userId = userId;
        this.userName = userName;
        this.skillDtos = skillDtos;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }



}
