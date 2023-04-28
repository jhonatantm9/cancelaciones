package com.udea.cancelaciones;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

// Probando...
@RestController
public class HolaMundo {
    @GetMapping("/")
    public String saludar(){
        return("Hola mundo");
    }
    
}
