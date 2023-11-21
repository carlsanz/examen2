package com.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen2.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
    
}
