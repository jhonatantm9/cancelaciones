package com.udea.cancelaciones.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.DTO.CancelarMateriaDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cancel-courses-api")
public class CancelCoursesController {
    
    @GetMapping
    public String getMessage(){
        return "Controlador de cancelación de cursos";
    }

    @PostMapping 
    public ResponseEntity<String> cancelarCurso(@RequestBody CancelarMateriaDTO cancelarMateriaDTO){
        System.out.println(cancelarMateriaDTO.getIdMateria()+" | | "+cancelarMateriaDTO.getMotivo());
        return ResponseEntity.ok("Success");
    }
}
