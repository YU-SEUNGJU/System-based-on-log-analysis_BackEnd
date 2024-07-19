package com.analysis.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/main")
public class MainController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
