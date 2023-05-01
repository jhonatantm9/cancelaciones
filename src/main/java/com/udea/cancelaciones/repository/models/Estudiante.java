package com.udea.cancelaciones.repository.models;

public class Estudiante extends Usuario{
    private String programa;
    private int nivel;
    private int creditosSemestre;
    private int creditosAcumulados;
    private EnumSituacionAcademica situacionAcademica;
    private Materia[] materias;

    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getCreditosSemestre() {
        return creditosSemestre;
    }
    public void setCreditosSemestre(int creditosSemestre) {
        this.creditosSemestre = creditosSemestre;
    }
    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }
    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }
    public EnumSituacionAcademica getSituacionAcademica() {
        return situacionAcademica;
    }
    public void setSituacionAcademica(EnumSituacionAcademica situacionAcademica) {
        this.situacionAcademica = situacionAcademica;
    }
    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
}
