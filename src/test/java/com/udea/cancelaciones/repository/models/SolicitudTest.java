package com.udea.cancelaciones.repository.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class SolicitudTest extends Solicitud{
    @Test
    void testGetEstudiante() {
        this.estudiante = new Estudiante();
        assertEquals(this.estudiante, this.getEstudiante());
    }

    @Test
    void testGetFecha() {
        this.fecha = new Date();
        assertEquals(this.fecha, this.getFecha());
    }

    @Test
    void testGetJustificacion() {
        this.justificacion = "Sobrecarga academica";
        assertEquals(this.justificacion, this.getJustificacion());
    }

    @Test
    void testSetEstudiante() {
        Estudiante estudiante = new Estudiante();
        this.setEstudiante(estudiante);
        assertEquals(estudiante, this.getEstudiante());
    }

    @Test
    void testSetFecha() {
        Date fecha = new Date();
        this.setFecha(fecha);
        assertEquals(fecha, this.getFecha());
    }

    @Test
    void testSetJustificacion() {
        String justificacion = "Sobrecarga academica";
        this.setJustificacion(justificacion);
        assertEquals(justificacion, this.getJustificacion());
    }
}
