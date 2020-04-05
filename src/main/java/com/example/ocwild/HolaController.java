package com.example.ocwild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaController {

    @GetMapping
    public String dimeHola(){
        String message = "Hola Amigo!";
        return message;
    }
}