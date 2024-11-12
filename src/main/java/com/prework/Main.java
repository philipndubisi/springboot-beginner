package com.prework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Controller
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @GetMapping(value="/greetings")
    public GreetResponse greet(){
        return new GreetResponse("Hello");
    }

    record GreetResponse(String greet){}
}
