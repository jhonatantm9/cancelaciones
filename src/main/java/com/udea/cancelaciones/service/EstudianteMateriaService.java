package com.udea.cancelaciones.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.models.Materia;
import com.udea.cancelaciones.repository.EstudianteMateriaRepository;
import com.udea.cancelaciones.repository.MateriaRepository;

@Service
@Transactional
public class EstudianteMateriaService {
    
    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private EstudianteMateriaRepository estudianteMateriaRepository;

    //Borrar esto
    public List<Materia> findAll(){
        var materias = materiaRepository.findAll();
        return materias;
    }

    public void cambiarEstadoMateria(String documentoEstudiante, String idMateria, String estado) {
        var estudianteMateria = estudianteMateriaRepository.findByMateriaAndDocumento(idMateria, documentoEstudiante);
        estudianteMateria.setEstado(estado);
        estudianteMateriaRepository.save(estudianteMateria);
    }

    public List<EstudianteMateria> findAllByDocumentoEstudiante(String documentoEstudiante){
        var estudianteMaterias = estudianteMateriaRepository.findAllByDocumentoEstudiante(documentoEstudiante);
        return estudianteMaterias;
    }

    public EstudianteMateria findByMateriaAndDocumento(String idMateria, String documentoEstudiante){
        var estudianteMateria = estudianteMateriaRepository.findByMateriaAndDocumento(idMateria, documentoEstudiante);
        return estudianteMateria;
    }

    public void deleteByIdMateriaAndDocumentoEstudiante(String idMateria, String DocumentoEstudiante){
        estudianteMateriaRepository.deleteByIdMateriaAndDocumentoEstudiante(idMateria, DocumentoEstudiante);
    }
}
