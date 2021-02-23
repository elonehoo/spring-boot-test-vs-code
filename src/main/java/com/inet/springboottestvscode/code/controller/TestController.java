package com.inet.springboottestvscode.code.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/test")
@Api(tags = {"管理用户的控制层"})
public class TestController {
    
    @GetMapping("/hello")
    @ApiOperation(value = "hello",httpMethod = "GET")
    public String getHello(){
        return "hello";
    }
}
