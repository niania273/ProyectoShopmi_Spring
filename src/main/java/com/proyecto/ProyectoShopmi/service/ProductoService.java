package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Categoria;
import com.proyecto.ProyectoShopmi.entity.Marca;
import com.proyecto.ProyectoShopmi.entity.Producto;
import com.proyecto.ProyectoShopmi.repository.CategoriaRepository;
import com.proyecto.ProyectoShopmi.repository.MarcaRepository;
import com.proyecto.ProyectoShopmi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository repositorio;

    @Autowired
    MarcaRepository repositorio2;

    @Autowired
    CategoriaRepository repositorio3;

    /* Listado */
    public List<Producto> getProductos()
    {
        return repositorio.findAll();
    }

    public Optional<Producto> getProducto(Integer id){
        return repositorio.findById(id);
    }

    public List<Marca> getMarcas() {
        return repositorio2.findAll();
    }

    public List<Categoria> getCategorias(){
        return repositorio3.findAll();
    }

    /* Guardar */
    public void saveProducto(Producto producto)
    {
        repositorio.save(producto);
    }

    public void saveMarca(Marca marca)
    {
        repositorio2.save(marca);
    }

    public void saveCategoria(Categoria categoria){
        repositorio3.save(categoria);
    }

    /* Actualizar */
    public void updateProducto(Integer id, Producto producto){
        if (!repositorio.existsById(id)) {
            throw new RuntimeException("Producto no encontrada");
        }
        producto.setCodProducto(id);
        repositorio.save(producto);
    }

    /* Eliminar */

    public void deleteProducto(Integer id){
        Producto producto = repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrada"));
        producto.setEstProducto(false);
        repositorio.save(producto);
    }
}
