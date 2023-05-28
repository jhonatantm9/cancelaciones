package com.udea.cancelaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.models.Materia;
import com.udea.cancelaciones.service.EstudianteMateriaService;

@RestController
@RequestMapping("/estudiante-materia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EstudianteMateriaController {
    
    @Autowired
    private EstudianteMateriaService estudianteMateriaService;

    @GetMapping("/find-all-by-documento-estudiante/{documento}")
    public ResponseEntity<?> findAllByDocumentoEstudiante(@PathVariable String documento){
        var materias = estudianteMateriaService.findAllByDocumentoEstudiante(documento);
        return ResponseEntity.ok(materias);
    }
}
