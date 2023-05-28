package com.udea.cancelaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.service.ProfesorMateriaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/profesor-materia")
public class ProfesorMateriaController {
    
    @Autowired
    private ProfesorMateriaService profesorMateriaService;

    @GetMapping("/find-all-by-documento-profesor/{documento}")
    public ResponseEntity<?> findAllByDocumentoProfesor(@PathVariable String documento){
        var materias = profesorMateriaService.findAllByDocumentoProfesor(documento);
        return ResponseEntity.ok(materias);
    }

}
