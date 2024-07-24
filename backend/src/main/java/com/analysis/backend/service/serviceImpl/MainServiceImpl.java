package com.analysis.backend.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.analysis.backend.service.MainService;

@Service
public class MainServiceImpl implements MainService{

    @Override
    public String testFunction(String param){
        return "Success";
    }
}
