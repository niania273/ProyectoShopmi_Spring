package com.proyecto.ProyectoShopmi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODUSUARIO")
    private Integer codUsu;

    @Column(name = "APEUSUARIO", nullable = false, length = 80)
    private String apeUsu;

    @Column(name = "NOMUSUARIO", nullable = false, length = 80)
    private String nomUsu;

    @Column(name = "CORUSUARIO", nullable = false, length = 100)
    private String corUsu;

    @Column(name = "CONUSUARIO", nullable = false, length = 50)
    private String conUsu;

    @Column(name = "FECCRE")
    private LocalDateTime fecCre;

    @Column(name = "ESTUSUARIO")
    private Boolean estUsu;

    @OneToOne
    @JoinColumn(name = "CODEMPLEADO")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "CODROL")
    private Rol rol;
}
