package com.example.demo.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class StudentController {

    private String name;
    @GetMapping
    public String getmessage(){
        return "welcome docker";
    }
}
