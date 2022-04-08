package com.example.ucb.prueba_jwt.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {
    
    @RequestMapping({ "/hello" })
    public String firstPage(){
        return "Hello World";
    }
}
