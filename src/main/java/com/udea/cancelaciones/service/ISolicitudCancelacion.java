package com.udea.cancelaciones.service;

import java.util.List;

import com.udea.cancelaciones.DTO.DatosFormCancelarMatDTO;
import com.udea.cancelaciones.models.SolicitudCancelacion;

public interface ISolicitudCancelacion {
    public void cambiarEstadoSolicitud(String idSolicitud, String estadoSolicitud);
    public void eliminarSolicitud(String idSolicitud);
    public List<SolicitudCancelacion> findAllByDocumentoEstudiante(String documento);
    public List<SolicitudCancelacion> findAllByDocumentoProfesorAndMateria(String idMateria, String documento);
    public void guardarSolicitudCancelacion(DatosFormCancelarMatDTO datosFormCancelarMatDTO);
    public String buscarDocumentoProfesor(String idMateria);
    public String generarIdSolicitud();
}
