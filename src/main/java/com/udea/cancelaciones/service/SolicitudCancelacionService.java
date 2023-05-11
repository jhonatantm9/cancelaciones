package com.udea.cancelaciones.service;

import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.repository.SolicitudCancelacionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SolicitudCancelacionService {

    private SolicitudCancelacionRepository solicitudCancelacionRepository;

    public SolicitudCancelacionService(SolicitudCancelacionRepository solicitudCancelacionRepository){
        this.solicitudCancelacionRepository = solicitudCancelacionRepository;
    }

    public List<SolicitudCancelacion> findAll(){
        var solicitudes = solicitudCancelacionRepository.findAll();
        return solicitudes;
    }

    public SolicitudCancelacion findSolicitudCancelacionByIdSolicitudCancelacion(String documento){
        var solicitud = solicitudCancelacionRepository.findSolicitudCancelacionByIdSolicitudCancelacion(documento);
        return solicitud;
    }

    public List<SolicitudCancelacion> findAllByDocumentoEstudiante(String documento){
        var solicitud = solicitudCancelacionRepository.findAllByDocumentoEstudiante(documento);
        return solicitud;
    }

}