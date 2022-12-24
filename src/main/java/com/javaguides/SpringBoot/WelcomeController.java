package com.javaguides.SpringBoot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome()
    {
        return  "welcome to spring boot world";
    }

}
