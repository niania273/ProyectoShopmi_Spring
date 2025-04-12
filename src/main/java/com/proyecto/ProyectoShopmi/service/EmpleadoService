package com.proyecto.ProyectoShopmi.service;



import com.proyecto.ProyectoShopmi.entity.Empleado;
import com.proyecto.ProyectoShopmi.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> getEmpleado(){
        return empleadoRepository.findAll();
    }
    public Empleado getEmpleado(int codEmp){
        return  empleadoRepository.findById(codEmp).orElse(null);
    }
    public void saveEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }
    public void updateEmpleado(Integer id, Empleado empleado) {
        if (!empleadoRepository.existsById(id)) {
            throw new RuntimeException("Empleado no encontrado");
        }
        empleado.setCodEmp(id);
        empleadoRepository.save(empleado);
    }
    public void delete(int codEmp){
        empleadoRepository.deleteById(codEmp);
    }
}
