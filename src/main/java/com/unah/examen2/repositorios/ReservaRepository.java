package com.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen2.modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva , Integer> {
    
}
