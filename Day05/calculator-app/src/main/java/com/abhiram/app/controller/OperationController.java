package com.abhiram.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {
    @GetMapping("/add")
    public long add(@RequestParam("x") long x,@RequestParam("y") long y){
        return x+y;
    }
    @PostMapping("/sub")
    public long sub(@RequestParam("x") long x,@RequestParam("y") long y){
        return x-y;
    }
    @PutMapping("/mul")
    public long mul(@RequestParam("x") long x,@RequestParam("y") long y){
        return x*y;
    }
    @DeleteMapping("/div")
    public long div(@RequestParam("x") long x,@RequestParam("y") long y){
        return x/y;
    }

}
