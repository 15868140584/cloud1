package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 学生信息表实体类
 * 对应数据库表：student
 */
@TableName("student") // 指定对应的数据库表名
@Getter
@Setter
public class Student {

    /**
     * 学生ID（自增主键）
     */
    @TableId(type = IdType.AUTO) // 主键自增策略
    private Integer id;

    /**
     * 学生姓名
     */
    @TableField("name") // 对应数据库字段名，字段名与属性名一致时可省略
    private String name;

    /**
     * 性别（男/女）
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 年级（如：高一、大二等）
     */
    private String grade;

    /**
     * 专业（可选）
     */
    private String major;

    /**
     * 学号（唯一）
     */
    @TableField("student_id")
    private String studentId;

    /**
     * 记录创建时间
     */
    @TableField(value = "create_time", fill = com.baomidou.mybatisplus.annotation.FieldFill.INSERT)
    private LocalDateTime createTime;

}
