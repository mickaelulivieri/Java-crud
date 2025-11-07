package com.crud.crudSimples.controller;

import com.crud.crudSimples.entity.Carro;
import com.crud.crudSimples.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")

public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Boas Vindas";
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Carro> adicionarCarro(@RequestBody Carro newCarro){
        Carro carroSalvo = carroService.save(newCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroSalvo);
    }




}
