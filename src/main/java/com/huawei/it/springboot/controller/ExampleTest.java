package com.huawei.it.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleTest {

    @ResponseBody
    @RequestMapping("/aa")
    public String isExample(){
        return "这是例子！";
    }
}
