package com.dennis.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String hello(){
        return "Welcome to Spring Boot !";
    }
}
