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
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODMARCA")
    private Integer codMarca;

    @Column(name = "NOMBREMARCA", nullable = false, length = 100)
    private String nomMarca;

    @Column(name = "ESTMARCA", nullable = false)
    private Boolean estMarca;
}
