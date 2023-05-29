package com.udea.cancelaciones.service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Estudiante;

public interface IEstudianteService {
    public Estudiante autenticar(DatosFormLoginDTO loginDTO);
}
