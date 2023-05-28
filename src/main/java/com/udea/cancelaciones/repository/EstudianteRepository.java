package com.udea.cancelaciones.repository;

import com.udea.cancelaciones.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    public Estudiante findEstudianteByUsuarioInstitucional(String usuario);
}
