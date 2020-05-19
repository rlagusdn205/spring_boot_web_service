package com.kim.book.springboot.web;


import com.kim.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "한글";
    }

    @GetMapping
    public HelloResponseDto helloDto(@RequestParam("name")String name, @RequestParam("amount") int amount){


        return new HelloResponseDto(name, amount);
    }


}
