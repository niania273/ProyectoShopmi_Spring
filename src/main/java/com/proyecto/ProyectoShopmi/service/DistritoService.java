package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Distrito;
import com.proyecto.ProyectoShopmi.repository.DistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoService {
    @Autowired
    DistritoRepository repository;

    public List<Distrito> getDistrito(){
        return repository.findAll();
    }
}
