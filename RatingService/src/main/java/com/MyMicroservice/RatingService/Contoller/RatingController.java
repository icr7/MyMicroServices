package com.MyMicroservice.RatingService.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rating")
public class RatingController {
    public static final String EMPLOYEE_URL="http://EMPLOYEE-APP/employee/get";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String get(){
        String employeeDetailResponse = restTemplate.getForObject(EMPLOYEE_URL,String.class);
        return "Rating Controller Hit!!! and employeeDetailResponse is : "+employeeDetailResponse;
    }
}
