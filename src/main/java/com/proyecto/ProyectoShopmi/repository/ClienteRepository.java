package com.proyecto.ProyectoShopmi.repository;


import com.proyecto.ProyectoShopmi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
