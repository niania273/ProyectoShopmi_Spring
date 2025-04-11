package com.proyecto.ProyectoShopmi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCLIENTE")
    private Integer codCli;

    @Column(name = "NUMEROCOMDOCUMENTO", unique = true)
    private String numDoc;

    @Column(name = "APELLIDOS")
    private String apeCli;

    @Column(name = "NOMBRES")
    private String nomCli;

    @ManyToOne
    @JoinColumn(name = "CODDISTRITO")
    private Distrito distrito;

    @Column(name = "DIRECCION")
    private String dirCli;

    @Column(name = "FECNAC")
    private LocalDate fecNac;

    @Column(name = "SEXO")
    private String sexCli;

    @Column(name = "CORREO")
    private String corCli;

    @Column(name = "TELEFONO")
    private String telClik;


    @Column(name = "ESTCLIENTE")
    private Boolean estCli;
}
