package com.example.demo.model;

/**
 * Created by Lenovo on 2018/5/28.
 */
public class User {

    //用户id
    private int id;
    //用户登入名
    private String userName;
    //用户密码
    private String password;
    //年龄
    private int age;
    //性别
    private String sex;
    //创建时间
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
