package com.udea.cancelaciones.service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Profesor;

public interface IProfesorService {
    public Profesor autenticar(DatosFormLoginDTO loginDTO);
}
