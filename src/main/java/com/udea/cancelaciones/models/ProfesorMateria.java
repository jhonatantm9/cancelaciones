package com.udea.cancelaciones.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "profesor_materia")
@Data
public class ProfesorMateria {

    @Id
    @Column(name = "id_materia")
    @NotNull
    private String idMateria;

    @Column(name = "documento_profesor")
    @NotNull
    private String documentoProfesor;

    @Column(name = "semestre_matricula")
    @NotNull
    private String semestreMatricula;


    @ManyToOne
    @JoinColumn(name = "documento_profesor_fk")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_materia_fk")
    private Materia materia;

    public ProfesorMateria() {

    }
}
