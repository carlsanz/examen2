package com.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.unah.examen2.modelos.Vehiculos;
import com.unah.examen2.repositorios.VehiculosRepository;
import com.unah.examen2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/apis/vehiculos")
public class VehiculosController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos nVehiculos){
        return this.vehiculoServiceImpl.CrearVehiculos(nVehiculos);
    }

    
}
