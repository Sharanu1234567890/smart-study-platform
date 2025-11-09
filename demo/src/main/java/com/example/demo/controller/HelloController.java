package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class HelloController {

    private final UserService userService;

    @GetMapping
    public String welcome() {
        return " Smart Study Platform API is running!";
    }
}
