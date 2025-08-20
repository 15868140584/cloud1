package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.po.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private StudentMapper studentMapper;

    public void findById(Integer id){
        Student student = studentMapper.selectById(id);
        System.out.println(student);
    }


}
