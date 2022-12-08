package com.api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {


    @GetMapping(value = "Hello")
    public String Hello(){
        return "Olá Mundo VScode com spring boot..";
    }
}
