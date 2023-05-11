package com.udea.cancelaciones.models;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.Set;


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

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Column(name = "direccion")
    private String direccion;

    @NotNull
    @Column(name = "telefono")
    private String telefono;

    @NotNull
    @Column(name = "estrato")
    private int estrato;

    @NotNull
    @Column(name = "usuario_institucional")
    private String usuarioInstitucional;

    @NotNull
    @Column(name = "contraseña")
    private String contraseña;

/*
    //RELACIONES
    @OneToMany(mappedBy = "estudiante", fetch = FetchType.LAZY)
    private Set<EstudianteMateria> estudianteMateriaSet;


    @OneToMany(mappedBy = "estudiante", fetch = FetchType.LAZY)
    private Set<SolicitudCancelacion> solicitudCancelacionSet;*/

    public Estudiante(){

    }
}