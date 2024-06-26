package com.example.mainjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/controller")
    public String myController(){
        return "Hi, this is Fork Changed Info";
    }
}
