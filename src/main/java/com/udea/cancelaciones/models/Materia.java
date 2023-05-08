package com.udea.cancelaciones.models;

public class Materia {
    private String nombre;
    private String codigo;
    private String grupo;
    private int creditos;
    private int numeroCancelaciones;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public int getNumeroCancelaciones() {
        return numeroCancelaciones;
    }
    public void setNumeroCancelaciones(int numeroCancelaciones) {
        this.numeroCancelaciones = numeroCancelaciones;
    }
}
