package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Cliente;
import com.proyecto.ProyectoShopmi.entity.Distrito;
import com.proyecto.ProyectoShopmi.service.ClienteService;
import com.proyecto.ProyectoShopmi.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;
    @Autowired
    public DistritoService distritoService;

    @GetMapping("/listar")
    public List<Cliente> getCliente(){
        return clienteService.getCliente();
    }

    @GetMapping("/distritos")
    public List<Distrito> getDistritos() {
        return distritoService.getDistrito();
    }


    @GetMapping("/listar/{codCli}")
    public Cliente getCliente(@PathVariable int codCli){
        return clienteService.getCliente(codCli);
    }

    @PostMapping("/registrar")
    public void registrarCliente(@RequestBody Cliente cliente){
        clienteService.saveCliente(cliente);
    }

    @PutMapping("/actualizar/{id}")
    public void updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente){
        clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/eliminar/{codCli}")
    public void eliminarCliente(@PathVariable int codCli){
        clienteService.delete(codCli);
    }
}

