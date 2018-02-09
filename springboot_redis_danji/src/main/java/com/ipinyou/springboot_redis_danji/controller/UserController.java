package com.ipinyou.springboot_redis_danji.controller;



import com.ipinyou.springboot_redis_danji.entity.User;
import com.ipinyou.springboot_redis_danji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/ssm")
    public List<User> returnList(){
        return userService.findAll();
    }

    /**
     * 插入
     */
    @RequestMapping("/add")
    public void add(){
        userService.add(new User("wangwu",19));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public void update(){
        userService.update(new User("wangwu",19));
    }

    /**
     * 删除
     */
    @RequestMapping("/del")
    public void del(){
        userService.del(2);
    }

    /**
     * 批量插入
     */
    @RequestMapping("/addlist")
    public void addlist(){
        List<User> list=new ArrayList<>();
        list.add(new User("111",21));
        list.add(new User("222",22));

        userService.addlist(list);
    }
}
