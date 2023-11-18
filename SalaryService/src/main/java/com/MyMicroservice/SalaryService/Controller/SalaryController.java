package com.MyMicroservice.SalaryService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    @GetMapping("/get")
    public String get(){
        return "Salary Controller Hit!!!";
    }
}
