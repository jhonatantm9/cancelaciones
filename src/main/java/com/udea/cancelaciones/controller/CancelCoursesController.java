package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.service.SolicitudCancelacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.DTO.CancelarMateriaDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cancel-courses-api")
public class CancelCoursesController {




    private SolicitudCancelacionService solicitudCancelacionService;

    public CancelCoursesController(SolicitudCancelacionService solicitudCancelacionService) {
        this.solicitudCancelacionService = solicitudCancelacionService;
    }





    @GetMapping
    public String getMessage(){
        return "Controlador de cancelación de cursos";
    }

    @PostMapping 
    public void cancelarCurso(@RequestBody CancelarMateriaDTO cancelarMateriaDTO){
        System.out.println(cancelarMateriaDTO.getIdMateria()+" | | "+cancelarMateriaDTO.getJustificacionCancelacion());


        SolicitudCancelacion cancelacion = new SolicitudCancelacion();

        cancelacion.setIdSolicitudCancelacion(cancelarMateriaDTO.getIdSolicitudCancelacion());
        cancelacion.setDocumentoEstudiante(cancelarMateriaDTO.getDocumentoEstudiante());
        cancelacion.setIdMateria(cancelarMateriaDTO.getIdMateria());
        cancelacion.setDocumentoProfesor(cancelarMateriaDTO.getDocumentoProfesor());
        cancelacion.setTipoSolicitud(cancelarMateriaDTO.getTipoSolicitud());
        cancelacion.setEstadoSolicitud(cancelarMateriaDTO.getEstadoSolicitud());
        cancelacion.setJustificacionCancelacion(cancelarMateriaDTO.getJustificacionCancelacion());

        solicitudCancelacionService.guardarSolicitudCancelacion(cancelacion);
    }
}

