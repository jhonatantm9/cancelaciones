package com.udea.cancelaciones.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cancelaciones.models.ProfesorMateria;
import com.udea.cancelaciones.repository.ProfesorMateriaRepository;

@Service
@Transactional
public class ProfesorMateriaService {
    
    @Autowired
    private ProfesorMateriaRepository profesorMateriaRepository;

    public List<ProfesorMateria> findAllByDocumentoProfesor(String documentoProfesor) {
        var materias = profesorMateriaRepository.findAllByDocumentoProfesor(documentoProfesor);
        return materias;
    }
}
