package com.example.demo.serviceImpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Lenovo on 2018/5/28.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {

        User user = userMapper.getUserByUserNameAndPassword(userName, password);

        return user;
    }

    @Override
    public int addUser(User user) {
        Date date = new Date();
        user.setUpDateTime(date);
        int a = userMapper.addUser(user);
        return a;
    }
}
