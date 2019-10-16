package com.example.dubbointerface.dto;

import java.io.Serializable;

/**
 * @Author wll
 * @Date 2019/10/16 14:42
 * @Description
 **/
public class UserDto implements Serializable {
    private Integer userId;
    private Integer age;
    private String name;
    private String school;

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
