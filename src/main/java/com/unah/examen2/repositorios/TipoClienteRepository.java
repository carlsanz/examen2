package com.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen2.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
