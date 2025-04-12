package com.proyecto.ProyectoShopmi.controller;

import com.proyecto.ProyectoShopmi.entity.Distrito;
import com.proyecto.ProyectoShopmi.entity.Empleado;
import com.proyecto.ProyectoShopmi.service.DistritoService;
import com.proyecto.ProyectoShopmi.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    public EmpleadoService empleadoService;

    @Autowired
    public DistritoService distritoService;

    @GetMapping("/listar")
    public List<Empleado> getEmpleados(){
        return empleadoService.getEmpleado();
    }

    @GetMapping("/distritos")
    public List<Distrito> getDistritos() {
        return distritoService.getDistrito();
    }

    @GetMapping("/listar/{codEmp}")
    public Empleado getEmpleado(@PathVariable int codEmp){
        return empleadoService.getEmpleado(codEmp);
    }

    @PostMapping("/registrar")
    public void registrarEmpleado(@RequestBody Empleado empleado){
        empleadoService.saveEmpleado(empleado);
    }

    @PutMapping("/actualizar/{id}")
    public void actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado empleado){
        empleadoService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/eliminar/{codEmp}")
    public void eliminarEmpleado(@PathVariable int codEmp){
        empleadoService.delete(codEmp);
    }
}
