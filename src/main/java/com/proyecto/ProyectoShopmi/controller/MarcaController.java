package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Marca;
import com.proyecto.ProyectoShopmi.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    private MarcaService servicio;

    @GetMapping
    public List<Marca> getAll()
    {
        return servicio.getMarcas();
    }

    @GetMapping("/{marcaId}")
    public Optional<Marca> getById(@PathVariable("marcaId") Integer marcaId)
    {
        return servicio.getMarca(marcaId);
    }

    @PostMapping
    public void guardarMarca(@RequestBody Marca marca)
    {
        servicio.saveMarca(marca);
    }

    @PutMapping("/{marcaId}")
    public void updateMarca(@PathVariable("marcaId") Integer marcaId, @RequestBody Marca marca) {
        servicio.updateMarca(marcaId, marca);
    }

    @DeleteMapping("/{marcaId}")
    public void deleteMarca(@PathVariable("marcaId") Integer marcaId) {
        servicio.deleteMarca(marcaId);
    }

}
