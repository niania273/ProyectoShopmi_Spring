package com.proyecto.ProyectoShopmi.repository;

import com.proyecto.ProyectoShopmi.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}