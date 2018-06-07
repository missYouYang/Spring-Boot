package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.notService.ServiceNote;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public String userLogin(ModelMap map, String userName, String password){

        User user = testService.getUserByUserNameAndPassword(userName,password);
        if(StringUtils.isEmpty(user)){

           /* map.put("message","你输入的用户或密码不正确");*/
            return "forward:test";
        }
        return "success";

    }
}
