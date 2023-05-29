package com.udea.cancelaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.cancelaciones.models.ProfesorMateria;

@Repository
public interface ProfesorMateriaRepository extends JpaRepository<ProfesorMateria, Integer>{
    ProfesorMateria findByIdMateria(String idMateria);
    List<ProfesorMateria> findAllByDocumentoProfesor(String documentoProfesor);
}
