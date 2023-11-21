package com.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen2.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
