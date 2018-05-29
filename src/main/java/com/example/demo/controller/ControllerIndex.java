package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * Created by Lenovo on 2018/5/24.
 */
@Controller
public class ControllerIndex {

    @Autowired
    private TestService testService;

   /* @RequestMapping("index")
    @ResponseBody
    public Map<String,Integer>  index(){
       *//* Map<String, Integer> map = new Map<String, Integer>();*//*
        Integer a = testService.getCount();
        System.out.println("是否执行");
        return "";
    }*/

}