package com.jeffrey.jenkisstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openapi")
public class OpenApiController {

    @GetMapping
    public String Hello(){
        return "Hello World!!!";
    }
}
