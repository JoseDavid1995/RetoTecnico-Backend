package com.prueba.demo.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ESTUDIANTE")
@Setter
@Getter
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido") 
    private String apellido; 

    @Column(name = "email")
    private String email;
    
    @Column(name = "creditos")
    private Integer creditos; 

    @Column(name = "semestre")
    private Integer semestre; 

    @Column(name = "promedio")
    private double promedio;
    
    @Column(name = "estado")
    private Integer estado;
}
