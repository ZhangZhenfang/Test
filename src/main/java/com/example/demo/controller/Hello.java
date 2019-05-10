package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhangZhenfang
 * @date 2019/5/10 20:56
 */

@Controller
@RequestMapping("hello")
public class Hello {

    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
