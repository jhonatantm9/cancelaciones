package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.DTO.DatosFormCancelarMatDTO;
import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.service.EstudianteService;
import com.udea.cancelaciones.service.SolicitudCancelacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solicitud-cancelacion")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SolicitudCancelacionController {



    @Autowired
    private SolicitudCancelacionService solicitudCancelacionService;

    @GetMapping("/find-all")
    public ResponseEntity<List<SolicitudCancelacion>> findAll(){
        var solicitudes = solicitudCancelacionService.findAll();
        return ResponseEntity.ok(solicitudes);
    }

    @GetMapping("/find-solicitud-por-documento/{documento}")
    public ResponseEntity<List<SolicitudCancelacion>> findAllByDocumentoEstudiante(@PathVariable String documento){
        var solicitud = solicitudCancelacionService.findAllByDocumentoEstudiante(documento);
        return ResponseEntity.ok(solicitud);
    }

    @GetMapping("/find-solicitud-por-id/{id}")
    public ResponseEntity<SolicitudCancelacion> findByIdSolicitudCancelacion(@PathVariable String id){
        var solicitud = solicitudCancelacionService.findByIdSolicitudCancelacion(id);
        return ResponseEntity.ok(solicitud);
    }

    //Cambiar esto
    public static int idSolicitud = 7;
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/save")
    public void saveSolicitudCancelacion(@RequestBody DatosFormCancelarMatDTO datosFormCancelarMatDTO){
        System.out.println(datosFormCancelarMatDTO.getIdMateria()+" | | "+datosFormCancelarMatDTO.getMotivo());
        
        idSolicitud++;

        var estudiante = estudianteService.findEstudianteByUsuarioInstitucional(datosFormCancelarMatDTO.getUser());

        SolicitudCancelacion cancelacion = new SolicitudCancelacion();
        cancelacion.setIdSolicitudCancelacion("SC00"+idSolicitud);
        cancelacion.setDocumentoEstudiante(estudiante.getDocumentoEstudiante());
        cancelacion.setIdMateria(datosFormCancelarMatDTO.getIdMateria());
        cancelacion.setDocumentoProfesor("1111111111");
        cancelacion.setTipoSolicitud("Cancelación");
        cancelacion.setEstadoSolicitud("Pendiente");
        cancelacion.setJustificacionCancelacion(datosFormCancelarMatDTO.getMotivo());

        solicitudCancelacionService.guardarSolicitudCancelacion(cancelacion);
    }
    //------------
}
