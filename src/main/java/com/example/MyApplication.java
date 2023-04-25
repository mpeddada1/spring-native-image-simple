package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ConditionalOnProperty(prefix = "my.test.property", name = "enabled", matchIfMissing = true)
public class MyApplication {


    @RequestMapping("/")
    String home() {
        return "Hello World! Conditional On Property Used";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
