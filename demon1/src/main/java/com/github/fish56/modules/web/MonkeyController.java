package com.github.fish56.modules.web;

import com.github.fish56.modules.service.MonkeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonkeyController {
    @Autowired
    private MonkeyService monkeyService;

    @RequestMapping("/monkey")
    public String monkey(){
        return monkeyService.getMonkeyName();
    }
}
