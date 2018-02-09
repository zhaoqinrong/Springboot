package com.ipinyou.springboot_mybatis.service.impl;

import com.ipinyou.springboot_mybatis.entity.User;
import com.ipinyou.springboot_mybatis.mapper.UserMapper;
import com.ipinyou.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(User lisi) {
        userMapper.add(lisi);
    }

    @Override
    public void update(User wangwu) {
        userMapper.update(wangwu);
    }

    @Override
    public void del(int i) {
        userMapper.del(i);
    }

    @Override
    public void addlist(List<User> list) {
        userMapper.addlist(list);
    }
}
