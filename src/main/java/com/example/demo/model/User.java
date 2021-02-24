package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2018/5/28.
 */
@Data
@AllArgsConstructor
public class User {

    //用户id
    private int id;
    //用户登入名
    private String userName;
    //用户密码
    private String password;
    //性别
    private String sex;
    //创建时间
    private Date upDateTime;
    //性别
    private List<Role> role;

    public User(){

    }

    public User(int id,String userName,String password,List<Role> role){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;

    }
}
