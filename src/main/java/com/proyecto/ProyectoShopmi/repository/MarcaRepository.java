package com.proyecto.ProyectoShopmi.repository;

import com.proyecto.ProyectoShopmi.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
