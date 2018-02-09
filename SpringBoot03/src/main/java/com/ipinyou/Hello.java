package com.ipinyou;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Hello {
    @RequestMapping("/list")
    public List<Student> returnList(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"lisi"));
        list.add(new Student(2,"zhangsan"));
        list.add(new Student(3,"wangwu111"));
        return  list;
    }
    @RequestMapping("/stu")
    public Student returnStu(){
    return new Student(new Date(),1,"lisi");
    }
}
