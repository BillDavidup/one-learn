package com.qiaoni.learn.onelearn.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/get/myName")
    public String getMyName(@RequestParam("nima") String name) {

        String hello = "你好世界！" + name;
        return hello;
    }
}
