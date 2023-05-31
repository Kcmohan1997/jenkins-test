package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class JenkinsController {

    @GetMapping(value = "/getUser/{name}")
    public Object getUer(@PathVariable String name){
        return "Hello " + name;
    }
}
