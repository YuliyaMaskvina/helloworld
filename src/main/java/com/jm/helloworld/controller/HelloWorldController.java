package com.jm.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
