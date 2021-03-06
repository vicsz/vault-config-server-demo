package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {

    @Value("${helloworld.message}")
    private String message;

    @Value("${secretmessage}")
    private String secret;

    @RequestMapping("hello")
    public String hello(){
        return message ;
    }

    @RequestMapping("secret")
    public String secret(){
        return secret ;
    }
}
