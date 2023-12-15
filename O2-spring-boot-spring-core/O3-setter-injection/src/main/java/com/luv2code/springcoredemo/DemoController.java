package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private filed for the dependency
    private Coach theCoach;
    /*define a setter for dependency injection
    * we can use any method name But we have to use @Autowired annotation
     */
    @Autowired
    public void setTheCoach(Coach theCoach){
        this.theCoach=theCoach;
    }
    //define a method for "theCoach" endpoint
    @GetMapping("/DailyWorkout")
    public String GetDailyWorkout(){
        return theCoach.getDailyWorkout();
    }

}
