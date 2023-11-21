package com.unah.examen2.modelos;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipocliente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCliente {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idTipoCliente;

    private String descripcion;

    @OneToMany
    private List<Cliente> clientes = new LinkedList<>();


}
