package com.example.ocwild;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaController {



    @GetMapping
    public String dimeHola(){
        String username = System.getenv("username");
        String message = "Hola Amigo!" + username;
        return message;
    }
}