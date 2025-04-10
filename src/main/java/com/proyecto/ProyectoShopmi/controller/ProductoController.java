package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Categoria;
import com.proyecto.ProyectoShopmi.entity.Marca;
import com.proyecto.ProyectoShopmi.entity.Producto;
import com.proyecto.ProyectoShopmi.service.CategoriaService;
import com.proyecto.ProyectoShopmi.service.MarcaService;
import com.proyecto.ProyectoShopmi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService servicio;

    @Autowired
    private MarcaService servicio2;

    @Autowired
    private CategoriaService servicio3;

    @GetMapping
    public List<Producto> getAll()
    {
        return servicio.getProductos();
    }

    @GetMapping("/{productoId}")
    public Optional<Producto> getById(@PathVariable("productoId") Integer productoId)
    {
        return servicio.getProducto(productoId);
    }

    @GetMapping("/marca")
    public List<Marca> getAllmMarcas()
    {
        return servicio2.getMarcas();
    }

    @GetMapping("/categoria")
    public List<Categoria> getAllCategoria()
    {
        return servicio3.getCategorias();
    }

    @PostMapping
    public void guardarProducto(@RequestBody Producto producto)
    {
        servicio.saveProducto(producto);
    }

    @PutMapping("/{productoId}")
    public void updateProducto(@PathVariable("productoId") Integer productoId, @RequestBody Producto producto)
    {
        servicio.updateProducto(productoId, producto);
    }

    @DeleteMapping("/{productoId}")
    public void deleteProducto(@PathVariable("productoId") Integer productoId)
    {
        servicio.deleteProducto(productoId);
    }
}
