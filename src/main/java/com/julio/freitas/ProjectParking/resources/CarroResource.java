package com.julio.freitas.ProjectParking.resources;

import com.julio.freitas.ProjectParking.entity.Carro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

    @GetMapping
    public ResponseEntity<List<Carro>> BuscarCarros(){
        List<Carro> listCar = new ArrayList<>();
        listCar.add(1,null);
        return ResponseEntity.ok().body(listCar);
    }
    @GetMapping(value = "/{placa}")
    public ResponseEntity<Carro> BuscaPorPlaca(@PathVariable String placa){
         Carro car = new Carro();
        return ResponseEntity.ok().body(car);
    }
}
