package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.notService.ServiceNote;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Lenovo on 2018/5/24.
 */
@Controller
@RequestMapping("user")
public class ControllerIndex {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ServiceNote(desc = "登入界面",auth = ServiceNote.AUTH.PUBLIC)
    public String login() {

        return "login";
    }
    @RequestMapping("/login")
    @ServiceNote(desc = "用户登录",auth = ServiceNote.AUTH.PUBLIC)
    private String userLogin(HttpServletResponse response, HttpServletRequest request, Person username,Person password){

        System.out.println(username +"........."+password);

        return "success";
    }
}
