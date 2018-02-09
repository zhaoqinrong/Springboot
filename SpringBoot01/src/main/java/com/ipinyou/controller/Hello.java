package com.ipinyou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进入了Controller中的hello");
        return "success";
    }
    @RequestMapping("/stu")
    public Student returnStu(){
            Student student = new Student();
            student.setAge(11);
            student.setName("zhangsan");
            return student;
    }
    @RequestMapping("/list")
    public List<Student> returnList(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"lisi"));
        list.add(new Student(2,"zhangsan"));
        list.add(new Student(3,"wangw"));
        return  list;

    }

}
