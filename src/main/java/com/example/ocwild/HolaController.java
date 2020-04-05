package com.example.ocwild;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaController {

    @Value("username")
    public String username;

    @GetMapping
    public String dimeHola(){
        String message = "Hola Amigo!" + username;
        return message;
    }
}