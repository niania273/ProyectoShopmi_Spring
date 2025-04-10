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
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODPRODUCTO")
    private Integer codProducto;

    @ManyToOne
    @JoinColumn(name = "CODCATEGORIA", nullable = false)
    private Categoria categoria;

    @Column(name = "IMGPRODUCTO", nullable = false, length = 225)
    private String imgProducto;

    @Column(name = "NOMPRODUCTO", nullable = false, length = 100)
    private String nomProducto;

    @Column(name = "DESCRIPCION", nullable = false, length = 225)
    private String descripcion;

    @Column(name = "PREUNI")
    private double preUni;

    @ManyToOne
    @JoinColumn(name = "CODMARCA", nullable = false)
    private Marca marca;

    @Column(name = "STOCK")
    private Integer stock;

    @Column(name = "ESTPRODUCTO", nullable = false)
    private boolean estProducto;

}
