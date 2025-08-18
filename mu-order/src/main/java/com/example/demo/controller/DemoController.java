package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/userDemoTest")
    public Result<User> userDemoTest() {
        User user = new User();
        user.setName("lisi");
        user.setPassword("123456");
        return new Result<>(user);
    }

}