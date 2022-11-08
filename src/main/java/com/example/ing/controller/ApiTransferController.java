package com.example.ing.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

// 프론트 완성 이전 확인용 - entity User2 (사용하려면 2 지워야 함)
/*
public class ApiTransferController {
    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User userData() {
        User user = new User("hello", 20);

        return user;
    }
    @PostMapping("/save-user")
    @ResponseBody
    public void saveUser(@RequestBody User user) {
        log.info("username={}",user.getUsername());
        log.info("age={}",user.getAge());
    }
}
*/

