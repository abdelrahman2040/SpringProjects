package com.luv2code.spring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties for coach name and team name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {return "CoachName: " +coachName +" , TeamName is: " +teamName;}
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is";
    }
    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
    //expose anew endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is ypur lucky day!";
    }
}
