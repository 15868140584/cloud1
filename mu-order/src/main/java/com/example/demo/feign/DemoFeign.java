package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="mu-login")
public interface DemoFeign {


    @GetMapping("/demo/userDemoTest1")
    String demo();

}
