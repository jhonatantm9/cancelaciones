package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.service.EstudianteMateriaService;
import com.udea.cancelaciones.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    private EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<Estudiante>> findAll(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes);
    }


    //http://localhost:8080/api/estudiante/find-estudiante-by-documento?documento=123456
    //http://localhost:8080/api/estudiante/find-estudiante-by-documento/123456
    @GetMapping("/find-estudiante-by-documento/{documento}")
    public ResponseEntity<Estudiante> findEstudianteByDocumentoEstudiante(@PathVariable String documento){
        var estudiante = estudianteService.findEstudianteByDocumentoEstudiante(documento);
        return ResponseEntity.ok(estudiante);
    }



}
