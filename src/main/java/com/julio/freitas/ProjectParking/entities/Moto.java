package com.julio.freitas.ProjectParking.entities;

import com.julio.freitas.ProjectParking.service.Veiculo;

import javax.persistence.Entity;

@Entity
public class Moto extends Veiculo {
    private String proprietario;

    public void ValorHora(){
    }
}
