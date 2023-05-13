package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/find-all")
    public ResponseEntity<List<Estudiante>> findAll(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes);
    }

    @GetMapping("/find-one")
    public ResponseEntity<Estudiante> findOne(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes.get(0));
    }

    //http://localhost:8080/api/estudiante/find-estudiante-by-documento?documento=123456
    //http://localhost:8080/api/estudiante/find-estudiante-by-documento/123456
    @GetMapping("/find-estudiante-by-documento/{documento}")
    public ResponseEntity<Estudiante> findEstudianteByDocumentoEstudiante(@PathVariable String documento){
        var estudiante = estudianteService.findEstudianteByDocumentoEstudiante(documento);
        return ResponseEntity.ok(estudiante);
    }

    //findEstudianteByUsuarioInstitucional
    @GetMapping("/find-estudiante-by-usuario/{usuario}")
    public ResponseEntity<Estudiante> findEstudianteByUsuarioInstitucional(@PathVariable String usuario){
        var estudiante = estudianteService.findEstudianteByUsuarioInstitucional(usuario);
        return ResponseEntity.ok(estudiante);
    }
}
