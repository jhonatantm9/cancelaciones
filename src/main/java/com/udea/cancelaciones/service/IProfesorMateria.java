package com.udea.cancelaciones.service;

import java.util.List;

import com.udea.cancelaciones.models.ProfesorMateria;

public interface IProfesorMateria {
    public List<ProfesorMateria> findAllByDocumentoProfesor(String documentoProfesor);
}
