package com.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.unah.examen2.modelos.TipoCliente;
import com.unah.examen2.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/apis/tipo/cliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/Crear")
    public TipoCliente CrearTipoCliente(@RequestBody TipoCliente nvoTipoCliente){
        return this.tipoClienteServiceImpl.crearCliente(nvoTipoCliente);
    }

    
}
