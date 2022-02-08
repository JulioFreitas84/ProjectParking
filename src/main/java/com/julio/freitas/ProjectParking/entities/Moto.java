package com.julio.freitas.ProjectParking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Moto {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String placa;
    private String marca;
    private String modelo;
    private Double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private Double totalEstacionamento;


    private String proprietario;

    public void ValorHora(){
        //15% desconto para moto
    }
}
