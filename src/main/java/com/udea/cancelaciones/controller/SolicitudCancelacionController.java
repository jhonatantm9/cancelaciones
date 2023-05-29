package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.DTO.DatosCambiarEstadoDTO;
import com.udea.cancelaciones.DTO.DatosFormCancelarMatDTO;
import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.service.SolicitudCancelacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solicitud-cancelacion")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SolicitudCancelacionController {

    @Autowired
    private SolicitudCancelacionService solicitudCancelacionService;

    @PutMapping("/actualizar-estado")
    public void actualizarEstadoSolicitud(@RequestBody DatosCambiarEstadoDTO datosCambiarEstadoDTO){
        solicitudCancelacionService.cambiarEstadoSolicitud(
            datosCambiarEstadoDTO.getIdSolicitud(), datosCambiarEstadoDTO.getEstadoSolicitud());
    }

    @DeleteMapping("/delete-by-idSolicitud/{idSolicitud}")
    public void eliminarSolicitud(@PathVariable String idSolicitud){
        solicitudCancelacionService.eliminarSolicitud(idSolicitud);
    }

    @GetMapping("/find-solicitud-por-documento-estudiante/{documento}")
    public ResponseEntity<List<SolicitudCancelacion>> findAllByDocumentoEstudiante(@PathVariable String documento) {
        var solicitud = solicitudCancelacionService.findAllByDocumentoEstudiante(documento);
        return ResponseEntity.ok(solicitud);
    }

    @GetMapping("/find-solicitud-por-documento-profesor")
    public ResponseEntity<List<SolicitudCancelacion>> findAllByDocumentoProfesorAndMateria(
        @RequestParam("idMateria") String idMateria, @RequestParam("documento") String documento) {
        var solicitud = solicitudCancelacionService.findAllByDocumentoProfesorAndMateria(idMateria, documento);
        return ResponseEntity.ok(solicitud);
    }

    @PostMapping("/guardar-solicitud")
    public ResponseEntity<?> saveSolicitudCancelacion(@RequestBody DatosFormCancelarMatDTO datosFormCancelarMatDTO) {
        try {
            solicitudCancelacionService.guardarSolicitudCancelacion(datosFormCancelarMatDTO);
            return ResponseEntity.ok("Cancelación recibida");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Ya existe una solicitud de cancelacion para esta materia");
        }
    }
}
