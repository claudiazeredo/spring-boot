package com.example.springboot.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSimpleController {

    @RequestMapping("/hello/{name}")
    public String talkWithMe(@PathVariable String name){
        return "Hello " + name;
    }
}
