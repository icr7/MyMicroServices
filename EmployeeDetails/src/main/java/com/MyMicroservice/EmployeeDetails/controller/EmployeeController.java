package com.MyMicroservice.EmployeeDetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/get")
    public String get(){
        return "Employee Controller hit!!";
    }

    @GetMapping("/get2")
    public String get2(){
        return "Employee Controller hit!! get2 ";
    }
}
