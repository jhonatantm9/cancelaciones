package com.udea.cancelaciones.models;

//Clase de prueba
public class MateriaModel {
    int codigo;
    String nombre;
    String profesor;
    
    public MateriaModel(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
