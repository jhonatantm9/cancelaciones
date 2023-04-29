package com.udea.cancelaciones.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MateriaModelTest {
    @Test
    void testGetCodigo() {
        int codigo = 25001;
        MateriaModel materia = new MateriaModel(codigo, "Logica 1");
        assertEquals(25001, materia.getCodigo());
    }

    @Test
    void testGetNombre() {
        String nombre = "Logica 1";
        MateriaModel materia = new MateriaModel(25001, nombre);
        assertEquals(nombre, materia.getNombre());
    }

    @Test
    void testSetCodigo() {
        MateriaModel materia = new MateriaModel(25001, "Logica 1");
        materia.setCodigo(123);
        int nuevoCodigo = materia.getCodigo();
        assertEquals(123, nuevoCodigo);
    }

    @Test
    void testSetNombre() {
        MateriaModel materia = new MateriaModel(25001, "Logica 1");
        materia.setNombre("Logica 2");
        assertEquals("Logica 2", materia.getNombre());
    }
}
