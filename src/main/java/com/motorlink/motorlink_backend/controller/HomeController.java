package com.motorlink.motorlink_backend.controller;

import com.motorlink.motorlink_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("register")
    public  String register(){
        return "index";
    }
}
