package com.example.springtest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://localhost:4200")
@RequestMapping("api")
public class MainController {

    @RequestMapping("getstr")
    public String getStr() {
        return "문자열 준다.aa3aa3";
    }

    @RequestMapping("getint")
    public String getInt() {
        return "숫자 준다.aa3aaaa3";
    }
}
