package com.proyecto.ProyectoShopmi.repository;

import com.proyecto.ProyectoShopmi.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}