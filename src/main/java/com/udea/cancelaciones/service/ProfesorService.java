package com.udea.cancelaciones.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Profesor;
import com.udea.cancelaciones.repository.ProfesorRepository;

@Service
@Transactional
public class ProfesorService implements IProfesorService{
    
    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor autenticar(DatosFormLoginDTO loginDTO) {
        var profesor = profesorRepository.findProfesorByUsuarioInstitucional(loginDTO.getUsuario());
        if (profesor != null) {
            if (profesor.getContraseña().equals(loginDTO.getContraseña())) {
                return profesor;
            } else {
                throw new RuntimeException("Invalid credentials");
            }
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
