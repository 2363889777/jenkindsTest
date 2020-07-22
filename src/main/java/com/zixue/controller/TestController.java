package com.zixue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类: TestController
 * @描述:
 * @date: 2020/7/13
 * @author: Admin
 * @ver 1.0.0
 * @since JDK 1.8
 */
@RestController
public class TestController {

    /**
     * 用来测试请求
     * @return
     */
    @GetMapping({"/index"})
    public String helloWorld() {
        System.out.println("执行了请求");
        return "Hello World";
    }
}
