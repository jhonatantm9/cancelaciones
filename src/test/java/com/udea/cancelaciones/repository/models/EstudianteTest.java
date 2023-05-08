package com.udea.cancelaciones.repository.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.udea.cancelaciones.models.EnumSituacionAcademica;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.Materia;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    @Test
    void testGetCreditosAcumulados() {
        Estudiante estudiante = new Estudiante();
        int creditos = 64;
        estudiante.setCreditosAcumulados(creditos);
        assertEquals(creditos, estudiante.getCreditosAcumulados());
    }

    @Test
    void testGetCreditosSemestre() {
        Estudiante estudiante = new Estudiante();
        int creditos = 14;
        estudiante.setCreditosSemestre(creditos);
        assertEquals(creditos, estudiante.getCreditosSemestre());
    }

    @Test
    void testGetMaterias() {
        Estudiante estudiante = new Estudiante();
        Materia[] materias = {new Materia(), new Materia()};
        estudiante.setMaterias(materias);
        assertEquals(materias, estudiante.getMaterias());
    }

    @Test
    void testGetNivel() {
        Estudiante estudiante = new Estudiante();
        int nivel = 5;
        estudiante.setNivel(nivel);
        assertEquals(nivel, estudiante.getNivel());
    }

    @Test
    void testGetPrograma() {
        Estudiante estudiante = new Estudiante();
        String programa = "Ingeniería de sistemas";
        estudiante.setPrograma(programa);
        assertEquals(programa, estudiante.getPrograma());
    }

    @Test
    void testGetSituacionAcademica() {
        Estudiante estudiante = new Estudiante();
        EnumSituacionAcademica situacion = EnumSituacionAcademica.ANTIGUONORMAL;
        estudiante.setSituacionAcademica(situacion);
        assertEquals(situacion, estudiante.getSituacionAcademica());
    }

    @Test
    void testSetCreditosAcumulados() {
        Estudiante estudiante = new Estudiante();
        int creditos = 71;
        estudiante.setCreditosAcumulados(creditos);
        assertEquals(creditos, estudiante.getCreditosAcumulados());
        
    }

    @Test
    void testSetCreditosSemestre() {
        Estudiante estudiante = new Estudiante();
        int creditos = 19;
        estudiante.setCreditosSemestre(creditos);
        assertEquals(creditos, estudiante.getCreditosSemestre());
    }

    @Test
    void testSetMaterias() {
        Estudiante estudiante = new Estudiante();
        Materia[] materias = {new Materia(), new Materia()};
        estudiante.setMaterias(materias);
        assertEquals(materias, estudiante.getMaterias());
    }

    @Test
    void testSetNivel() {
        Estudiante estudiante = new Estudiante();
        int nivel = 7;
        estudiante.setNivel(nivel);
        assertEquals(nivel, estudiante.getNivel());
    }

    @Test
    void testSetPrograma() {
        Estudiante estudiante = new Estudiante();
        String programa = "Ingeniería de sistemas";
        estudiante.setPrograma(programa);
        assertEquals(programa, estudiante.getPrograma());
    }

    @Test
    void testSetSituacionAcademica() {
        Estudiante estudiante = new Estudiante();
        EnumSituacionAcademica situacion = EnumSituacionAcademica.ANTIGUONORMAL;
        estudiante.setSituacionAcademica(situacion);
        assertEquals(situacion, estudiante.getSituacionAcademica());
    }
}
