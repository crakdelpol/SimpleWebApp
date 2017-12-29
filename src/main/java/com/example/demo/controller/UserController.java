package com.example.demo.controller;

import com.example.demo.dto.UserDto;

import com.example.demo.service.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Constants;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserServiceimpl userService;

    @RequestMapping("/getUser")
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
    @RequestMapping("/getAllUsers")
    public List< UserDto > getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
