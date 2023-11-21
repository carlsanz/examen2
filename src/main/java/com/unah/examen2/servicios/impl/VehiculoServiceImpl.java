package com.unah.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.unah.examen2.modelos.Vehiculos;
import com.unah.examen2.repositorios.VehiculosRepository;
import com.unah.examen2.servicios.VehiculoService;

public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculosRepository vehiculosRepository;

    @Override
    public Vehiculos CrearVehiculos(Vehiculos vehiculos) {
        return this.vehiculosRepository.save(vehiculos);

    }
    
}
