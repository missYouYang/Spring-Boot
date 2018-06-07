package com.example.demo.service;

import com.example.demo.model.User;

/**
 * Created by Lenovo on 2018/5/28.
 */
public interface TestService {



    User getUserByUserNameAndPassword(String userName, String password);
}
