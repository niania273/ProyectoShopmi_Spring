package com.proyecto.ProyectoShopmi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Data

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODPEDIDO")
    private Integer codPed;

    @Column(name = "FECPED")
    private LocalDateTime fecPed;

    @Column(name = "PRECIOTOTAL")
    private double precioTotal;

    @Column(name = "ACTPED", nullable = false, length = 30)
    private String actPed;

    @Column(name = "ESTPEDIDO", nullable = false)
    private boolean estPed;

    @ManyToOne
    @JoinColumn(name = "CODCLIENTE", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "CODEMPLEADO", nullable = false)
    private Empleado empleado;
}
