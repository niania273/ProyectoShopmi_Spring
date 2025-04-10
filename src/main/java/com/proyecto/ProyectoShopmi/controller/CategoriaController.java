package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Categoria;
import com.proyecto.ProyectoShopmi.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService servicio;

    @GetMapping
    public List<Categoria> getAll()
    {
        return servicio.getCategorias();
    }

    @GetMapping("/{categoriaId}")
    public Optional<Categoria> getById(@PathVariable("categoriaId") Integer categoriaId)
    {
        return servicio.getCategoria(categoriaId);
    }

    @PostMapping
    public void guardarCategoria(@RequestBody Categoria categoria)
    {
        servicio.saveCategoria(categoria);
    }

    @PutMapping("/{categoriaId}")
    public void updateCategoria(@PathVariable("categoriaId") Integer categoriaId, @RequestBody Categoria categoria)
    {
        servicio.updateCategoria(categoriaId, categoria);
    }

    @DeleteMapping("/{categoriaId}")
    public void deleteMarca(@PathVariable("categoriaId") Integer categoriaId)
    {
        servicio.deleteCategoria(categoriaId);
    }
}
