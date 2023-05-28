package com.udea.cancelaciones.service;

import com.udea.cancelaciones.DTO.DatosFormCancelarMatDTO;
import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.repository.ProfesorMateriaRepository;
import com.udea.cancelaciones.repository.SolicitudCancelacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SolicitudCancelacionService implements ISolicitudCancelacion{

    @Autowired
    private SolicitudCancelacionRepository solicitudCancelacionRepository;

    @Autowired
    private ProfesorMateriaRepository profesorMateriaRepository;

    @Autowired
    private EstudianteMateriaService estudianteMateriaService;

    public void cambiarEstadoSolicitud(String idSolicitud, String estadoSolicitud) {
        var solicitud = solicitudCancelacionRepository.findByIdSolicitudCancelacion(idSolicitud);
        String estadoMateria="";
        if (estadoSolicitud.compareTo("Aceptada") == 0) {
            estadoMateria = "Cancelada";
        } else if (estadoSolicitud.compareTo("Rechazada") == 0){
            estadoMateria = "Cursando";
        }
        estudianteMateriaService.cambiarEstadoMateria(solicitud.getDocumentoEstudiante(), 
            solicitud.getIdMateria(), estadoMateria);
        solicitud.setEstadoSolicitud(estadoSolicitud);
        solicitudCancelacionRepository.save(solicitud);
    }

    public void eliminarSolicitud(String idSolicitud) {
        var solicitud = solicitudCancelacionRepository.findByIdSolicitudCancelacion(idSolicitud);
        estudianteMateriaService.cambiarEstadoMateria(solicitud.getDocumentoEstudiante(), 
            solicitud.getIdMateria(), "Cursando");
        solicitudCancelacionRepository.deleteByIdSolicitudCancelacion(idSolicitud);
    }

    public List<SolicitudCancelacion> findAllByDocumentoEstudiante(String documento) {
        var solicitud = solicitudCancelacionRepository.findAllByDocumentoEstudiante(documento);
        for (int i = 0; i < solicitud.size(); i++) {
            var estudianteMateria = estudianteMateriaService
                    .findByMateriaAndDocumento(solicitud.get(i).getIdMateria(),
                            solicitud.get(i).getDocumentoEstudiante());
            solicitud.get(i).setEstudianteMateria(estudianteMateria);
        }
        return solicitud;
    }

    public List<SolicitudCancelacion> findAllByDocumentoProfesorAndMateria(String idMateria, String documento) {
        var solicitud = solicitudCancelacionRepository.findAllByDocumentoProfesorAndMateria(idMateria, documento);
        for (int i = 0; i < solicitud.size(); i++) {
            var estudianteMateria = estudianteMateriaService
                    .findByMateriaAndDocumento(solicitud.get(i).getIdMateria(),
                            solicitud.get(i).getDocumentoEstudiante());
            solicitud.get(i).setEstudianteMateria(estudianteMateria);
        }
        return solicitud;
    }

    public void guardarSolicitudCancelacion(DatosFormCancelarMatDTO datosFormCancelarMatDTO) {
        if (solicitudCancelacionRepository.findByMateriaAndDocumentoEstudiante(datosFormCancelarMatDTO.getIdMateria(),
                datosFormCancelarMatDTO.getDocumentoEstudiante()) == null) {
            SolicitudCancelacion cancelacion = new SolicitudCancelacion();
            cancelacion.setIdSolicitudCancelacion(this.generarIdSolicitud());
            cancelacion.setDocumentoEstudiante(datosFormCancelarMatDTO.getDocumentoEstudiante());
            cancelacion.setIdMateria(datosFormCancelarMatDTO.getIdMateria());
            cancelacion.setDocumentoProfesor(buscarDocumentoProfesor(datosFormCancelarMatDTO.getIdMateria()));
            cancelacion.setTipoSolicitud("Cancelación materia");
            cancelacion.setEstadoSolicitud("Pendiente");
            cancelacion.setJustificacionCancelacion(datosFormCancelarMatDTO.getMotivo());

            estudianteMateriaService.cambiarEstadoMateria(datosFormCancelarMatDTO.getDocumentoEstudiante(), 
            datosFormCancelarMatDTO.getIdMateria(), "En espera");
            solicitudCancelacionRepository.save(cancelacion);

        } else {
            throw new RuntimeException("Ya existe una solicitud de cancelacion para esta materia");
        }
    }

    public String buscarDocumentoProfesor(String idMateria) {
        String documento = profesorMateriaRepository.findByIdMateria(idMateria).getDocumentoProfesor();
        return documento;
    }

    public String generarIdSolicitud() {
        String idSolicitud = "";
        boolean existeId = true;
        int contador = 0;
        while (existeId) {
            contador++;
            if (contador < 10) {
                idSolicitud = "SC00" + contador;
            } else if (contador < 100) {
                idSolicitud = "SC0" + contador;
            } else {
                idSolicitud = "SC" + contador;
            }
            existeId = solicitudCancelacionRepository.existsByIdSolicitudCancelacion(idSolicitud);

        }
        return idSolicitud;
    }

}
