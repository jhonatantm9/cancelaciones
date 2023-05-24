package com.udea.cancelaciones.DTO;

public class DatosMateriaDTO {
    
    private String nombre;
    private String idMateria;
    private String creditos;
    private String codigo;
    private String grupo;
    private double porcentajeEvaluado;
    private double nota;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    public String getCreditos() {
        return creditos;
    }
    public void setCreditos(String creditos) {
        this.creditos = creditos;
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
    public double getPorcentajeEvaluado() {
        return porcentajeEvaluado;
    }
    public void setPorcentajeEvaluado(double porcentajeEvaluado) {
        this.porcentajeEvaluado = porcentajeEvaluado;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}
