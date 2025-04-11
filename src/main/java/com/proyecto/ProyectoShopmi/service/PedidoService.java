package com.proyecto.ProyectoShopmi.service;

import com.proyecto.ProyectoShopmi.entity.Pedido;
import com.proyecto.ProyectoShopmi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public LocalDateTime obtenerFechaActual() {
        return LocalDateTime.now();
    }

    public List<Pedido> getPedidos(boolean estPed) {
        return estPed ? repository.findByEstPed(true) : repository.findAll();
    }

    public Pedido getPedido(int codPed) {
        return repository.findById(codPed).orElse(null);
    }

    public String savePedido(Pedido pedido) {
        pedido.setFecPed(obtenerFechaActual());
        pedido.setEstPed(true);
        repository.save(pedido);

        Pedido pedidoRegistrado = getPedido(pedido.getCodPed());

        return pedidoRegistrado != null
                ? "¡Éxito! Se registró el pedido"
                : "¡Error! No se registró el pedido";
    }

    public String updatePedido(Pedido pedido) {
        Pedido pedidoExistente = getPedido(pedido.getCodPed());

        if (pedidoExistente == null) {
            return "¡Error! No se encontró el pedido";
        }

        pedidoExistente.setPrecioTotal(pedido.getPrecioTotal());
        pedidoExistente.setActPed(pedido.getActPed());
        pedidoExistente.setCliente(pedido.getCliente());
        pedidoExistente.setEmpleado(pedido.getEmpleado());
        pedidoExistente.setFecPed(obtenerFechaActual()); // opcional
        repository.save(pedidoExistente);

        return "¡Éxito! Se actualizó el pedido";
    }

    public String deletePedido(int codPed) {
        Pedido pedidoExistente = getPedido(codPed);

        if (pedidoExistente == null) {
            return "¡Error! No se encontró el pedido";
        }

        pedidoExistente.setEstPed(false);
        repository.save(pedidoExistente);

        return "¡Éxito! Se eliminó el pedido";
    }
}
