package com.unah.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.unah.examen2.modelos.TipoVehiculo;

import com.unah.examen2.repositorios.TipoVehiculoRepository;

import com.unah.examen2.servicios.TipoVehiculoService;

public class TipoVehiculoServiceImpl implements TipoVehiculoService {
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo nvoTipoVehiculo) {
       return tipoVehiculoRepository.save(nvoTipoVehiculo);
    };

   
}
