package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.service.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/autenticar-login")
    public ResponseEntity<?> autenticar(@RequestBody DatosFormLoginDTO loginDTO) {
        try {
            var estudiante = estudianteService.autenticar(loginDTO);
            return ResponseEntity.ok(estudiante);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
