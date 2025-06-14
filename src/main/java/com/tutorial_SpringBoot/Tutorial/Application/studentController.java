package com.tutorial_SpringBoot.Tutorial.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController  {

    @GetMapping("/get")
    public String getStudent(){
        return "Student List";
    }
    @PostMapping("/create")
    public String addStudent(){
        return "Student added";
    }
}
