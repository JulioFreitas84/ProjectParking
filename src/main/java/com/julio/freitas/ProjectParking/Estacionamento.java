package com.julio.freitas.ProjectParking;

import com.julio.freitas.ProjectParking.entities.Carro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public class Estacionamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valorHora;
    private Double totalFaturamento;
    private Double totalFaturamentoCarro;
    private Double totalFaturamentoMoto;
    private Double totalFaturamentoUtilitario;


    public Estacionamento() {
    }
    public Double ValorHora(){
        return valorHora;
        //carro valor inteiro
        //15% desconto para moto
        //15% adição para utilitario
    }
    public Instant DarEntrada(Instant instant){
        return instant;
    }

    public Instant DarSaida(Instant instant) {
        return instant;
    }

    public List<Carro> procurarCarro(){
        return procurarCarro();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Estacionamento that = (Estacionamento) o;
        return Objects.equals(valorHora, that.valorHora);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

