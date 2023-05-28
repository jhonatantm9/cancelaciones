package com.udea.cancelaciones.service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@Service
@Transactional
public class EstudianteService implements IEstudianteService{

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
}
