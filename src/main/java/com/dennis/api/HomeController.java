package com.dennis.api;

import com.dennis.api.home.HomeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins =  "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeService service;

    @RequestMapping("/")
    public String hello() {

        String s = service.test();
        return "Welcome to Spring Boot - 9";
    }

    @PostMapping("/name")
    public Map<String,?> name(@RequestBody Map<String,?> map) {
        String name = (String)map.get("name");
        System.out.println("리퀘스트가 가져온 이름: " + name);
        Map<String,String> respMap = new HashMap<>();
        respMap.put("name", "환영합니다 "+name);
        return respMap;
    }
}
