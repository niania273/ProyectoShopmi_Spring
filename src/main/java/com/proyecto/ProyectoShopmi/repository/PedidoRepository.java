package com.proyecto.ProyectoShopmi.repository;

import com.proyecto.ProyectoShopmi.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByEstPed(boolean estPed);

}
