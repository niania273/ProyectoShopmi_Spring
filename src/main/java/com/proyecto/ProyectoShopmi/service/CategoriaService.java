package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Categoria;
import com.proyecto.ProyectoShopmi.entity.Marca;
import com.proyecto.ProyectoShopmi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repositorio;

    public List<Categoria> getCategorias(){
        return repositorio.findAll();
    }

    public Optional<Categoria> getCategoria(Integer id){
        return repositorio.findById(id);
    }

    public void saveCategoria(Categoria categoria){
        repositorio.save(categoria);
    }

    public void updateCategoria(Integer id, Categoria categoria){
        if (!repositorio.existsById(id)) {
            throw new RuntimeException("Categoria no encontrada");
        }
        categoria.setCodCategoria(id);
        repositorio.save(categoria);
    }

    public void deleteCategoria(Integer id){
        Categoria categoria = repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        categoria.setEstCategoria(false);
        repositorio.save(categoria);
    }
}
