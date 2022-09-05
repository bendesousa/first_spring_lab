package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {


//    MVP 1
//    @GetMapping
//    public String greeting(){
//        return "Good afternoon Ben";
//    }


    @GetMapping
    public Greeting greeting(@RequestParam(value = "timeOfDay") String timeOfDay){
        return new Greeting("Ben", timeOfDay);
    }

}
