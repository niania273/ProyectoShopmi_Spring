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
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCATEGORIA")
    private Integer codCategoria;

    @Column(name = "IMGCATEGORIA", nullable = false, length = 225)
    private String imgCategoria;

    @Column(name = "NOMCATEGORIA", nullable = false, length = 100)
    private String nomCategoria;

    @Column(name = "ESTCATEGORIA", nullable = false)
    private Boolean estCategoria;
}
