package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.List;

interface UserService{
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List< UserDto > getAllUsers();
}