package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Usuario;
import com.proyecto.ProyectoShopmi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService service;

    @GetMapping("/listar")
    public List<Usuario> getUsuarios(){
        return service.getUsuarios(true);
    }

    @GetMapping("/listar/{codUsu}")
    public Usuario getUsuario(@PathVariable int codUsu){
        return service.getUsuario(codUsu);
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@RequestBody Usuario usuario){
        return service.saveUsuario(usuario);
    }

    @PutMapping("/actualizar")
    public String actualizarUsuario(@RequestBody Usuario usuario){
        return service.updateUsuario(usuario);
    }

    @DeleteMapping("/eliminar/{codUsu}")
    public String eliminarUsuario(@PathVariable int codUsu){
        return service.deleteUsuario(codUsu);
    }
}
