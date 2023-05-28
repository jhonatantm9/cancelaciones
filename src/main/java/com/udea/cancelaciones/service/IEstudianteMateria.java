package com.udea.cancelaciones.service;

import java.util.List;

import com.udea.cancelaciones.models.EstudianteMateria;

public interface IEstudianteMateria {
    public void cambiarEstadoMateria(String documentoEstudiante, String idMateria, String estado);
    public List<EstudianteMateria> findAllByDocumentoEstudiante(String documentoEstudiante);
    public EstudianteMateria findByMateriaAndDocumento(String idMateria, String documentoEstudiante);
    public void deleteByIdMateriaAndDocumentoEstudiante(String idMateria, String DocumentoEstudiante);
}
