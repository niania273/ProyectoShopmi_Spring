package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Marca;
import com.proyecto.ProyectoShopmi.entity.Usuario;
import com.proyecto.ProyectoShopmi.repository.MarcaRepository;
import org.hibernate.dialect.lock.OptimisticEntityLockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
    @Autowired
    MarcaRepository repositorio;

    public List<Marca> getMarcas() {
        return repositorio.findAll();
    }

    public Optional<Marca> getMarca(Integer id)
    {
        return repositorio.findById(id);
    }

    public void saveMarca(Marca marca)
    {
        repositorio.save(marca);
    }

    public void updateMarca(Integer id, Marca marca) {
        if (!repositorio.existsById(id)) {
            throw new RuntimeException("Marca no encontrada");
        }
        marca.setCodMarca(id);
        repositorio.save(marca);
    }

    public void deleteMarca(Integer id) {
        Marca marca = repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Marca no encontrada"));
        marca.setEstMarca(false);
        repositorio.save(marca);
    }

}
