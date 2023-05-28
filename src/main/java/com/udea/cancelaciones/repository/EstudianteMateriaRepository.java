package com.udea.cancelaciones.repository;

import com.udea.cancelaciones.models.EstudianteMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteMateriaRepository extends JpaRepository<EstudianteMateria, Integer> {
    void deleteByIdMateriaAndDocumentoEstudiante(String idMateria, String DocumentoEstudiante);
    List<EstudianteMateria> findEstudianteMateriaByDocumentoEstudiante(String documento);
    List<EstudianteMateria> findAllByDocumentoEstudiante(String documentoEstudiante);

    @Query("SELECT em FROM EstudianteMateria em WHERE em.idMateria = :idMateriaParam AND em.documentoEstudiante = :documentoEstudianteParam")
    EstudianteMateria findByMateriaAndDocumento(String idMateriaParam, String documentoEstudianteParam);
}
