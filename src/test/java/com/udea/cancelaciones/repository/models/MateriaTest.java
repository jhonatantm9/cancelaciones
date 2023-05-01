package com.udea.cancelaciones.repository.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MateriaTest {
    @Test
    void testGetCodigo() {
        Materia materia = new Materia();
        String codigo = "2508610";
        materia.setCodigo(codigo);
        assertEquals(codigo, materia.getCodigo());
    }

    @Test
    void testGetCreditos() {
        Materia materia = new Materia();
        int creditos = 3;
        materia.setCreditos(creditos);
        assertEquals(creditos, materia.getCreditos());
    }

    @Test
    void testGetGrupo() {
        Materia materia = new Materia();
        String grupo = "10";
        materia.setGrupo(grupo);
        assertEquals(grupo, materia.getGrupo());
    }

    @Test
    void testGetNombre() {
        Materia materia = new Materia();
        String nombre = "Analisis 2";
        materia.setNombre(nombre);
        assertEquals(nombre, materia.getNombre());
    }

    @Test
    void testGetNumeroCancelaciones() {
        Materia materia = new Materia();
        int numeroCancelaciones = 3;
        materia.setNumeroCancelaciones(numeroCancelaciones);
        assertEquals(numeroCancelaciones, materia.getNumeroCancelaciones());
    }

    @Test
    void testSetCodigo() {
        Materia materia = new Materia();
        String codigo = "2508610";
        materia.setCodigo(codigo);
        assertEquals(codigo, materia.getCodigo());
    }

    @Test
    void testSetCreditos() {
        Materia materia = new Materia();
        int creditos = 3;
        materia.setCreditos(creditos);
        assertEquals(creditos, materia.getCreditos());
    }

    @Test
    void testSetGrupo() {
        Materia materia = new Materia();
        String grupo = "10";
        materia.setGrupo(grupo);
        assertEquals(grupo, materia.getGrupo());
    }

    @Test
    void testSetNombre() {
        Materia materia = new Materia();
        String nombre = "Analisis 2";
        materia.setNombre(nombre);
        assertEquals(nombre, materia.getNombre());
    }

    @Test
    void testSetNumeroCancelaciones() {
        Materia materia = new Materia();
        int numeroCancelaciones = 3;
        materia.setNumeroCancelaciones(numeroCancelaciones);
        assertEquals(numeroCancelaciones, materia.getNumeroCancelaciones());
    }
}
