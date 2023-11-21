package com.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen2.modelos.TipoVehiculo;
import com.unah.examen2.modelos.Vehiculos;
import com.unah.examen2.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/apis/tipo/vehiculo")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo){
        if(tipoVehiculo.getVehiculos() != null){
            for (Vehiculos vehiculos : tipoVehiculo.getVehiculos()) {
                vehiculos.setTipovehiculo(tipoVehiculo);                
            }
        }
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
}
