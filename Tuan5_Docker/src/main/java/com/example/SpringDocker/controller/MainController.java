package com.example.SpringDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String hello(){
        return "Huỳnh Hữu Phước - 20098251";
    }
}
