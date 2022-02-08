package com.julio.freitas.ProjectParking.resources;

import com.julio.freitas.ProjectParking.entities.Carro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

    @GetMapping
    public ResponseEntity<List<Carro>> buscarCarros(){
        List<Carro> listCar = new ArrayList<>();
        return ResponseEntity.ok().body(listCar);
    }

    @PostMapping
    public ResponseEntity<Carro> inserirVeiculo(@PathVariable Long id, Carro carro){
        Carro c1 = new Carro();
        return ResponseEntity.ok().body(carro);
    }
    /*
    @GetMapping(value = "/{placa}")
    public ResponseEntity<Carro> BuscaPorPlaca(@PathVariable String placa){
         Carro car = new Carro();
        return ResponseEntity.ok().body(car);
    }
    */
}
