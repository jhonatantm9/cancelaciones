package com.udea.cancelaciones.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MateriaModelTest {
    @Test
    void testGetCodigo() {
        int codigo = 25001;
        MateriaModel materia = new MateriaModel(codigo, "Logica 1");
        assertEquals(codigo, materia.getCodigo());
    }

    @Test
    void testGetNombre() {
        String nombre = "Logica 1";
        MateriaModel materia = new MateriaModel(25001, nombre);
        assertEquals(nombre, materia.getNombre());
    }

    @Test
    void testSetCodigo() {
        MateriaModel materia = new MateriaModel(25001, "Logica");
        materia.setCodigo(123);
        assertEquals(123, materia.getCodigo());
    }

    @Test
    void testSetNombre() {
        MateriaModel materia = new MateriaModel(25001, "Logica");
        materia.setNombre("Analisis 2");
        assertEquals("Analisis 2", materia.getNombre());
    }
}
