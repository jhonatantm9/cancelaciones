package com.udea.cancelaciones.repository;

import com.udea.cancelaciones.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    //Esta clase ya puede hacer todo lo que necesita para acceder a labase de datos por JPA

    public Estudiante findEstudianteByDocumentoEstudiante(String documento);

}
