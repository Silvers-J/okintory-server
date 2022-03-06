package com.okizone.okintory.user.controller;

import com.okizone.okintory.user.dto.RegisterUserRequest;
import com.okizone.okintory.user.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    ResponseEntity<String> registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        userService.registerUser();
        return new ResponseEntity<String>("DONE", HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    String sample() {
        return "Hello world";
    }
}
