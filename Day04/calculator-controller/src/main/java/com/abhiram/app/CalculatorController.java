package com.abhiram.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    public double add(@RequestParam("x") double x,@RequestParam("y") double y){
        return x+y;
    }
    @GetMapping("/sub")
    public double sub(@RequestParam("x") double x,@RequestParam("y") double y){
        return x-y;
    }
    @GetMapping("/mul")
    public double mul(@RequestParam("x") double x,@RequestParam("y") double y){
        return x*y;
    }
    @GetMapping("/div")
    public double div(@RequestParam("x") double x,@RequestParam("y") double y){
        return x/y;
    }
}
