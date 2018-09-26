package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/tianqi")
@Controller
public class TestCcontroller {
    @GetMapping("/x")
    public String tiqi(){
        return "c";
    }
}
