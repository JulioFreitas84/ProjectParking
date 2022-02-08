package com.julio.freitas.ProjectParking.entities;

import com.julio.freitas.ProjectParking.service.Veiculo;

import javax.persistence.Entity;


@Entity
public class Utilitario extends Veiculo {
    //15% adição para utilitario
    private String proprietario;

    public void ValorHora(){
    }
}
