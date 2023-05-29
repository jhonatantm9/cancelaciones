package com.udea.cancelaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.service.ProfesorService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/profesor")
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;

    @PostMapping("/autenticar-login")
    public ResponseEntity<?> autenticar(@RequestBody DatosFormLoginDTO loginDTO){
        try{
            var profesor = profesorService.autenticar(loginDTO);
            return ResponseEntity.ok(profesor);
        } catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
