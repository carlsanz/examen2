package com.unah.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen2.modelos.TipoCliente;
import com.unah.examen2.repositorios.TipoClienteRepository;
import com.unah.examen2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {
    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearCliente(TipoCliente nvoTipoCliente) {
        return this.tipoClienteRepository.save(nvoTipoCliente);
    }

    
}
