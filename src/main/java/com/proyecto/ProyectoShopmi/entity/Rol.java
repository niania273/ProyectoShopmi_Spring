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
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODROL")
    private Integer codRol;

    @Column(name = "NOMBREROL", nullable = false, length = 100)
    private String nomRol;

    @Column(name = "ESTROL", nullable = false)
    private Boolean estRol;
}
