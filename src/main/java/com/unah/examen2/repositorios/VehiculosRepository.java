package com.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen2.modelos.Vehiculos;

public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer> {
    
}
