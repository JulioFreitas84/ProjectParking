package com.julio.freitas.ProjectParking.service;

import com.julio.freitas.ProjectParking.Estacionamento;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@MappedSuperclass
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;
    private String marca;
    private String modelo;
    private Double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private Double totalEstacionamento;

    @ManyToOne
    @JoinColumn(name = "estacionamento_valor_hora")
    private Estacionamento estacionamento;

    public Veiculo(String placa, String marca, String modelo, Double fatorEstacionamento, String horaEntrada
            , String horaSaida, Double totalEstacionamento, Estacionamento estacionamento) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fatorEstacionamento = fatorEstacionamento;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.totalEstacionamento = totalEstacionamento;
        this.estacionamento = estacionamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
