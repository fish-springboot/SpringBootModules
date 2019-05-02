package com.github.fish56.modules.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    // 确认SpringBoot正常使用
    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
}
