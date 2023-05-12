package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.service.EstudianteMateriaService;
import com.udea.cancelaciones.service.EstudianteService;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> prueba

import java.util.List;

@RestController
<<<<<<< HEAD
@CrossOrigin(origins="*")
=======
@CrossOrigin(origins = "*")
>>>>>>> prueba
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

<<<<<<< HEAD
    @GetMapping("/find-one")
    public ResponseEntity<Estudiante> findOne(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes.get(0));
    }
=======

    //http://localhost:8080/api/estudiante/find-estudiante-by-documento?documento=123456
    //http://localhost:8080/api/estudiante/find-estudiante-by-documento/123456
    @GetMapping("/find-estudiante-by-documento/{documento}")
    public ResponseEntity<Estudiante> findEstudianteByDocumentoEstudiante(@PathVariable String documento){
        var estudiante = estudianteService.findEstudianteByDocumentoEstudiante(documento);
        return ResponseEntity.ok(estudiante);
    }



>>>>>>> prueba
}
