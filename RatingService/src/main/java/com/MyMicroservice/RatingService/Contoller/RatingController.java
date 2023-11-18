package com.MyMicroservice.RatingService.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/get")
    public String get(){
        return "Rating Controller Hit!!!";
    }
}
