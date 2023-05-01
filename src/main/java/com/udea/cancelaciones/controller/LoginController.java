package com.udea.cancelaciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login-api")
public class LoginController {
    
    @GetMapping
    public String getMessage(){
        return("Controlador del login");
    }
}
