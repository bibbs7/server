package com.splitit.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}