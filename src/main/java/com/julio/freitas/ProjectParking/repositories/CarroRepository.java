package com.julio.freitas.ProjectParking.repositories;

import com.julio.freitas.ProjectParking.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    /*
    private Map<String, Carro> map;
    public void save(Carro carro){ }
    public void buscarPlaca(String placa){ }
     */
}
