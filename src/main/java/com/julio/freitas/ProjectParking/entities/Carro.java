package com.julio.freitas.ProjectParking.entities;

import com.julio.freitas.ProjectParking.service.Veiculo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "Carro")
public class Carro extends Veiculo {
    //carro valor inteiro
    @Column(length = 200)
    private String proprietario;

    private Timestamp horaEntrada;


    public Carro() {
    }

    public Carro(String proprietario, Timestamp horaEntrada) {
        this.proprietario = proprietario;
        this.horaEntrada = horaEntrada;
    }

}
