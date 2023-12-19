package com.MyMicroservice.RatingService.Contoller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
    @CircuitBreaker(name="ratingCircuitBreaker", fallbackMethod = "getRatingFallback")
    public String get(){
        String employeeDetailResponse = restTemplate.getForObject(EMPLOYEE_URL,String.class);
        return "Rating Controller Hit!!! and employeeDetailResponse is : "+employeeDetailResponse;
    }

    public String getRatingFallback(Throwable throwable){
        return "rating server unable to fetch employee data as : employee server is currenty down please try after sometime!!!";
    }

}
