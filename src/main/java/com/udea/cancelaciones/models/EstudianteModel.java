package com.udea.cancelaciones.models;

import javax.persistence.Entity;

@Entity
public class EstudianteModel {
    String tipoDocumento;
    int numeroDocumento;
    String nombre;    

    public EstudianteModel(String tipoDocumento, int numeroDocumento, String nombre) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public int getNumeroDocumento() {
        return numeroDocumento;
    }
    
    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
