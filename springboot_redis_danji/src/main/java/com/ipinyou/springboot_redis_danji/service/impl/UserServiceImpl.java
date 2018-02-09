package com.ipinyou.springboot_redis_danji.service.impl;


import com.ipinyou.springboot_redis_danji.entity.User;
import com.ipinyou.springboot_redis_danji.mapper.UserMapper;
import com.ipinyou.springboot_redis_danji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    @Cacheable(value = "user.find")//将findAll()方法查询的结果放入到缓存中并取名为find
    public List<User> findAll() {
        System.out.println("如何缓存中存在,不会走此方法");
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
