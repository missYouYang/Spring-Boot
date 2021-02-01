package com.example.demo.serviceImpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: UserServiceImpl
 * @Author: 860620058
 * @Date: 2020/10/21 10:04
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    //注入Mapper接口
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

}
