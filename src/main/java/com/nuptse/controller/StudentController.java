package com.nuptse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/create")
    public String hello() {
        return "student/create";
    }
}
