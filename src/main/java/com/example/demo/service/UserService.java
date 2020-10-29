package com.example.demo.service;

import com.example.demo.model.User;

/**
 * @ProjectName: Spring-Boot
 * @Package: com.example.demo.service
 * @ClassName: UserService
 * @Author: 860620058
 * @Description: UserService
 * @Date: 2020/10/21 10:04
 * @Version: 1.0
 */
public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);
}
