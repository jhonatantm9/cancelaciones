package com.udea.cancelaciones.repository;


import com.udea.cancelaciones.models.SolicitudCancelacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudCancelacionRepository extends JpaRepository<SolicitudCancelacion, Integer> {
    SolicitudCancelacion findByIdSolicitudCancelacion(String id);
    List<SolicitudCancelacion> findAllByDocumentoEstudiante(String documento);
    boolean existsByIdSolicitudCancelacion(String idSolicitud);
    void deleteByIdSolicitudCancelacion(String idSolicitudCancelacion);
    
    @Query("SELECT sc FROM SolicitudCancelacion sc WHERE sc.idMateria = :idMateriaParam AND sc.documentoProfesor = :documentoProfesorParam")
    List<SolicitudCancelacion> findAllByDocumentoProfesorAndMateria(String idMateriaParam, String documentoProfesorParam);

    @Query("SELECT sc FROM SolicitudCancelacion sc WHERE sc.idMateria = :idMateriaParam AND sc.documentoEstudiante = :documentoEstudianteParam")
    SolicitudCancelacion findByMateriaAndDocumentoEstudiante(String idMateriaParam, String documentoEstudianteParam);
}
