package com.example.demo.converter;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

import java.util.stream.Collectors;

/**
 * To convert DTO -> Entity and Entity -> DTO
 * @author matteo.pipitone
 * @version 1.0
 *
 */
public class UserConverter {


    public static User dtoToEntity(UserDto userDto){
        User user = new User(userDto.getUserName(), null);
        user.setUserId(userDto.getUserId());
        user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
        return user;
    }

    public static UserDto entityToDto(User user) {
        UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
        userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
