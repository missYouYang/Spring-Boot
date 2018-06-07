package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Lenovo on 2018/5/28.
 */
@Repository
public interface UserMapper {


    User getUserByUserNameAndPassword(String userName, String password);

}
