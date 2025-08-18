package com.example.demo.controller;

import com.example.demo.entity.DemoConfig;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Value("${server.port}")
    private String loginUrl;

    @Value("${other.make}")
    private String commonTest;

    @Autowired
    private DemoConfig demoConfig;

    @GetMapping("/userDemoTest")
    public Result<User> userDemoTest() {
        User user = new User();
        user.setName("lisi");
        user.setPassword("123456");

        System.out.println(demoConfig);
        return new Result<>(user);
    }


    @GetMapping("/userDemoTest1")
    public String userDemoTest1() {
        return "hello";
    }

}