package com.generic.ProjetoSpringCloudConfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Hello-World")
public class HelloWorldController {

    @Value("${variable.data.hello-world}")
    private String helloWorld;

    @GetMapping()
    public String helloWorld(){
        return helloWorld;
    }


}
