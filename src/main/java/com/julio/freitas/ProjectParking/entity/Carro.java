package com.julio.freitas.ProjectParking.entity;

import com.julio.freitas.ProjectParking.Veiculo;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Carro")
public class Carro extends Veiculo {

    @Column(length = 200)
    private String proprietario;


    private DateTimeFormat horaEntrada;
}
