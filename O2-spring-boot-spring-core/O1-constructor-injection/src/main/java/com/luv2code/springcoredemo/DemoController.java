package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private filed for the dependency
    private Coach theCoach;
    //define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach){
        this.theCoach=theCoach;;
    }
    //define a method for "theCoach" endpoint
    @GetMapping("/dailyworkout")
    public String getdailyworkout(){
        return theCoach.getDailyWorkout();
    }

}
