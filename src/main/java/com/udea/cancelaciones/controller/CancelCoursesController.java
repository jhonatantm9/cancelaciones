package com.udea.cancelaciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cancel-courses-api")
public class CancelCoursesController {
    
    @GetMapping
    public String getMessage(){
        return "Controlador de cancelación de cursos";
    }
}
