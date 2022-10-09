package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
     public String getLoginView(){
         return "login";
     }

    @GetMapping("face")
    public String getLoginViewFace(){
        return "face";
    }

    @GetMapping("courses")
    public String getCourses(){
        return "courses";
    }
}
