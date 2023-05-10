package com.udea.cancelaciones.service;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EstudianteService {

    //El DAO es el repository

    private EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> findAll(){
        var listaEstudiantes = estudianteRepository.findAll();
        return listaEstudiantes;
    }

    public Estudiante findByDocumentoEstudiante(String documento){
        var estudiante = estudianteRepository.findByDocumentoEstudiante(documento);
        return estudiante;
    }
}
