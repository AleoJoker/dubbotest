package com.aleo.dubbo.controller;

import com.aleo.dubbo.service.consumer.ConsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerServiceImpl service;

    @GetMapping(value = "/test/{name}")
    public String getData(@PathVariable String name) {


        String result = service.getData(name);
        System.out.println(name);
        System.out.println(result);
        return result;
    }

}
