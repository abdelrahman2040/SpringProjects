package com.luv2code.springcoredemo.Common;

import org.springframework.stereotype.Component;

@Component
public class CracketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes";
    }
}
