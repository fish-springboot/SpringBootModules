package com.github.fish56.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 这个启动类是用来做测试的
//   必须放在测试目录下，不然会和其他模块冲突
//   一山不容二 @SpringBootApplication
//   https://stackoverflow.com/questions/37615914
@SpringBootApplication
public class CommonsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonsApplication.class, args);
    }
}
