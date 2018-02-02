package com.example.securityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "Private area";
    }

}
