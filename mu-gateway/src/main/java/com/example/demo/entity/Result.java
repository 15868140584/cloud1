package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result<T>{

    private String message;
    private String code;
    private T data;

    public Result(T data) {
        this.data = data;
        this.code = "200";
        this.message = "success";
    }

}
