package com.analysis.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analysis.backend.service.MainService;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/test")
    public String test(String stParam) {

        String rtString = "";

        rtString = mainService.testFunction(stParam);

        return rtString;
    }
}
