package com.example.demo.exection;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: Spring-Boot
 * @Package: com.example.demo.exection
 * @ClassName: MyExceptionHandler
 * @Author: 860620058
 * @Description:
 * @Date: 2020/10/28 13:56
 * @Version: 1.0
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public String ErrorHandler(AuthorizationException e) {
        log.error("没有通过权限验证！", e);
        return "没有通过权限验证！";
    }
}
