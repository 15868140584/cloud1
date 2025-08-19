package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userDemoTest")
    public Result<User> userDemoTest() {
        User user = new User();
        user.setName("lisi");
        user.setPassword("123456");
        return new Result<>(user);
    }

    @GetMapping("/findServiceTest")
    public void findService(){

        String url = "http://mu-login/demo/userDemoTest1";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);

    }

}