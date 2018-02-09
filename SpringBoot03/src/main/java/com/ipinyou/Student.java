package com.ipinyou;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Student {
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public Student(Date date, int age, String name) {
        this.date = date;
        this.age = age;
        this.name = name;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
