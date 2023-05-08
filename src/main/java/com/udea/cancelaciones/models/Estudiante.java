package com.udea.cancelaciones.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import lombok.Data;


@Entity
@Table(name = "estudiante")
@Data
public class Estudiante{

    @Id
    @NotNull
    @Column(name = "documento_estudiante")
    private String documentoEstudiante;


    @NotNull
    @Column(name = "tipo_documento_estudiante")
    private String tipoDocumentoEstudiante;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estrato")
    private int estrato;

    public Estudiante(){

    }
}
