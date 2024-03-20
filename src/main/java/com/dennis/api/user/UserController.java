package com.dennis.api.user;

import com.dennis.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins =  "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/login")
    public Map<String,?> username(@RequestBody Map<?,?> paraMap) {
        String username = (String)paraMap.get("username");
        System.out.println("리퀘스트가 가져온 아이디: "+username);
        Map<String,String> map = new HashMap<>();
        map.put("username","환영합니다 "+username);
        return map;
    }
    UserServiceImpl user;
    UserRepository repo;

    public List<?> findUsers() throws SQLException {
        return repo.findUsers();
    }


    public Map<String,?> save(@RequestBody Map<?,?> paraMap) {
        System.out.println("Please enter Username, Password, Name, Phone Number, Address, Job, Height, Weight.");
        return null;
    }

    public String addUsers() {
        return user.addUsers();
    }

    public String count() {
        return null;
    }

    public Map userList() {
        return null;
    }

    public Map<String,?> login(@RequestBody Map<?,?> paraMap) {
        System.out.println("Please enter Username, password.");
        return null;
    }

    public Map<String,?> updatePassword(@RequestBody Map<?,?> paraMap) {
        return null;
    }

    public Map<String,?> deleteAccount(@RequestBody Map<?,?> paraMap) {
        System.out.println("삭제할 계정의 아이디, 비밀번호를 입력해 주세요.");
        return null;
    }

    public Map<String,?> getOne(@RequestBody Map<?,?> paraMap) {
        return null;
    }

    public Messenger createTable() throws SQLException {
        return null;
    }

    public String deleteTable() throws SQLException {
        return null;
    }
}