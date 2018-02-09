package com.ipinyou;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
private  TeacherService teacherService;
    @RequestMapping("/add")
    public String add(){
        Teacher teacher=new Teacher("zhangsan","北京海淀");
        teacherService.add(teacher);
        return "success";

    }
    @RequestMapping("/list")
    public String list(){
    teacherService.find(1);
        return "success";
    }
    @RequestMapping("/del")
    public String del(){
        try {
            teacherService.delete(1);
        } catch (Exception e) {
            return "shibai";

        }
        return "success";
    }
    @RequestMapping("/update")
    public String update(){
    Teacher teacher=new Teacher();
    teacher.settId(1);
    teacher.settName("lisi");
    teacherService.update(teacher);
    return "success";
    }

}
