package com.udea.cancelaciones.service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante autenticar(DatosFormLoginDTO loginDTO) {
        var estudiante = estudianteRepository.findEstudianteByUsuarioInstitucional(loginDTO.getUsuario());

        if (estudiante != null) {
            if (estudiante.getContraseña().equals(loginDTO.getContraseña())) {
                return estudiante;
            } else {
                throw new RuntimeException("Invalid credentials");
            }
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    //Metodo para pruebas 
    public List<Estudiante> findAll(){
        var listaEstudiantes = estudianteRepository.findAll();
        return listaEstudiantes;
    }

    //Creo que este metodo se usuara 
    public Estudiante findEstudianteByDocumentoEstudiante(String documento){
        var estudiante = estudianteRepository.findEstudianteByDocumentoEstudiante(documento);
        return estudiante;
    }

    public Estudiante findEstudianteByUsuarioInstitucional(String usuario){
        var estudiante = estudianteRepository.findEstudianteByUsuarioInstitucional(usuario);
        return estudiante;
    }
}
