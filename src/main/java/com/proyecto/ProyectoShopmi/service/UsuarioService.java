package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Usuario;
import com.proyecto.ProyectoShopmi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public LocalDateTime obtenerFechaActual(){
        LocalDateTime fechaActual = LocalDateTime.now();
        return fechaActual;
    }

    public List<Usuario> getUsuarios(boolean estUsu){
        List<Usuario> listado;

        if (estUsu){
            listado = repository.findByEstUsu(true);
        } else {
            listado = repository.findAll();
        }
        return listado;
    }

    public Usuario getUsuario(int codUsu){
        return repository.findById(codUsu).orElse(null);
    }

    public String saveUsuario(Usuario usuario){

        usuario.setFecCre(obtenerFechaActual());
        usuario.setEstUsu(true);
        repository.save(usuario);

        Usuario usuarioRegistrado = getUsuario(usuario.getCodUsu());

        if (usuarioRegistrado != null ){
            return "¡Éxito! Se registró el usuario";
        }
        else {
            return "¡Error! No se registró el usuario";
        }
    }

    public String updateUsuario(Usuario usuario){

        Usuario usuarioExistente = getUsuario(usuario.getCodUsu());

        if (usuarioExistente == null){
            return "¡Error! No se encontró el usuario";
        }

        usuarioExistente.setNomUsu(usuario.getNomUsu());
        usuarioExistente.setApeUsu(usuario.getApeUsu());
        usuarioExistente.setCorUsu(usuario.getCorUsu());
        usuarioExistente.setFecCre(obtenerFechaActual());
        usuarioExistente.setConUsu(usuario.getConUsu());
        usuarioExistente.setEstUsu(true);
        usuarioExistente.setEmpleado(usuario.getEmpleado());
        repository.save(usuarioExistente);

        return "¡Éxito! Se actualizó el usuario";
    }

    public String deleteUsuario(int codUsu){
        Usuario usuarioExistente = getUsuario(codUsu);

        if (usuarioExistente == null){
            return "¡Error! No se encontró el usuario";
        }

        usuarioExistente.setEstUsu(false);
        repository.save(usuarioExistente);

        return "¡Éxito! Se eliminó el usuario";
    }
}
