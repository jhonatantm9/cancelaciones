package com.udea.cancelaciones.repository.models;

public class SolicitudCancelarMateria extends Solicitud{
    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
