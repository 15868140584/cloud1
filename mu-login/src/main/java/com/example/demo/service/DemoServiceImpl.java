package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.po.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private StudentMapper studentMapper;

    public User findById(Integer id){
        Student student = studentMapper.selectById(id);

        User user = new User();
        BeanUtils.copyProperties(student,user);
        return user;
    }


}
