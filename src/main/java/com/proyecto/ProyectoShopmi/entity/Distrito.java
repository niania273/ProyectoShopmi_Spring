package com.proyecto.ProyectoShopmi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODDISTRITO")
    private Integer codDistrito;

    @Column(name = "NOMBREDISTRITO")
    private String nombreDistrito;

    @Column(name = "CODPOSTAL")
    private String codPos;

    @Column(name = "ESTDISTRITO")
    private Boolean estDis;
}
