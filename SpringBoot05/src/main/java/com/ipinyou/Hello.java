package com.ipinyou;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Hello {
    @RequestMapping("/get")
    public String getStudents(Model model) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"a"));
        students.add(new Student(2,"b"));
        students.add(new Student(3,"c"));
        model.addAttribute("stus",students);
        return "hello";
    }
}
