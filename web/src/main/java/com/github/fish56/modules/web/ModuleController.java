package com.github.fish56.modules.web;

import com.github.fish56.modules.service.MonkeyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {
    // 确认可以引入其他模块
    @RequestMapping("/service")
    public String dependency(){
        MonkeyService monkeyService = new MonkeyService();
        return monkeyService.getMonkeyName();
    }
}
