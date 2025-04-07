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
public class Empleado {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CODEMPLEADO")
        private Integer codEmp;

        @Column(name = "NUMERODOCUMENTO", unique = true)
        private String numDoc;

        @Column(name = "APELLIDOS")
        private String apeEmp;

        @Column(name = "NOMBRES")
        private String nomEmp;

        @ManyToOne
        @JoinColumn(name = "CODDISTRITO")
        private Distrito distrito;

        @Column(name = "DIRECCION")
        private String dirEmp;

        @Column(name = "FECNAC")
        private LocalDate fecNac;

        @Column(name = "SEXO")
        private String sexEmp;

        @Column(name = "CORREO")
        private String corEmp;

        @Column(name = "ESTEMPLEADO")
        private Boolean estEmp;
}
