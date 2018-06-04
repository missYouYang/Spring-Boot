package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Lenovo on 2018/5/24.
 */
@Controller
public class ControllerIndex {
    /*你好*/
    @Autowired
    private TestService testService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
       /* Map<String, Integer> map = new Map<String, Integer>();*/
        Integer a = testService.getCount();
        System.out.println("是否执行");
        return "";
    }
}
