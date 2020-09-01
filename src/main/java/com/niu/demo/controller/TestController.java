package com.niu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value="/api/doit")
    public String doit(){
        //测试的一个项目
        return "阿牛";
    }
}
