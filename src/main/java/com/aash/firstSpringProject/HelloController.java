package com.aash.firstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Konichiva!";
    }

    @PostMapping("/hello")
    public String HelloPost(@RequestBody String name){
        return "Moshi Moshi " + name + " san!";
    }
}
