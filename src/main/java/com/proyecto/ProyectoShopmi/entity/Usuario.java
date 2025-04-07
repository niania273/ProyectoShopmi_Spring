package com.proyecto.ProyectoShopmi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @Column(name = "ESTUSUARIO", nullable = false)
    private Boolean estUsu; // Mapeo de TINYINT a Boolean

    @OneToOne
    @JoinColumn(name = "CODEMPLEADO")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "CODROL")
    private Rol rol;
}
