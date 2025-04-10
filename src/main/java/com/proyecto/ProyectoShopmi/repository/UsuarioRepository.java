package com.proyecto.ProyectoShopmi.repository;

import com.proyecto.ProyectoShopmi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByEstUsu(boolean estUsu);
}