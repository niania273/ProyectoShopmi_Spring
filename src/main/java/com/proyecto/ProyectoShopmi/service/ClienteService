package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Cliente;
import com.proyecto.ProyectoShopmi.entity.Empleado;
import com.proyecto.ProyectoShopmi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getCliente(){
        return clienteRepository.findAll();
    }
    public Cliente getCliente(int codCli){
        return  clienteRepository.findById(codCli).orElse(null);
    }
    public void saveCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
    public void updateCliente(Integer id, Cliente cliente) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente no encontrado");
        }
        cliente.setCodCli(id);
        clienteRepository.save(cliente);
    }
    public void delete(int codCli){
        clienteRepository.deleteById(codCli);
    }
}

