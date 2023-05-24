package com.udea.cancelaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.cancelaciones.models.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{
    public Profesor findProfesorByUsuarioInstitucional(String usuario);
    public Profesor findProfesorByDocumentoProfesor(String documento);
}
