package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Pedido;
import com.proyecto.ProyectoShopmi.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/listar")
    public List<Pedido> getPedidos() {
        return service.getPedidos(true);
    }

    @GetMapping("/listar/{codPed}")
    public Pedido getPedido(@PathVariable int codPed) {
        return service.getPedido(codPed);
    }

    @PostMapping("/registrar")
    public String registrarPedido(@RequestBody Pedido pedido) {
        return service.savePedido(pedido);
    }

    @PutMapping("/actualizar")
    public String actualizarPedido(@RequestBody Pedido pedido) {
        return service.updatePedido(pedido);
    }

    @DeleteMapping("/eliminar/{codPed}")
    public String eliminarPedido(@PathVariable int codPed) {
        return service.deletePedido(codPed);
    }
}
