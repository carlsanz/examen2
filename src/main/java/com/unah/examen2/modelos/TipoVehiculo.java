package com.unah.examen2.modelos;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "tipovehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipovehiculo")
    @Id
    private int idTipoVehículo;


    private String descripcion;

    @Column(name="precioxhora")
    private float precioXhora; 

    @OneToMany(cascade = CascadeType.ALL)
    private List<Vehiculos> vehiculos = new LinkedList<>();

    
}
