package com.ipinyou.springboot_redis_danji.service;



import com.ipinyou.springboot_redis_danji.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    void add(User lisi);

    void update(User wangwu);

    void del(int i);

    void addlist(List<User> list);

}
