package com.ipinyou.springboot_mybatis.mapper;

import com.ipinyou.springboot_mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAll();

    void add(User lisi);

    void update(User wangwu);

    void del(int i);

    void addlist(List<User> list);
}
