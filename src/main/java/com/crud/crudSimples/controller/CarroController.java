package com.crud.crudSimples.controller;

import com.crud.crudSimples.entity.Carro;
import com.crud.crudSimples.service.CarroService;;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    // ENDPOINT DE LISTAR CARRO
    @GetMapping("/listar")
    public ResponseEntity<List<Carro>> listarCarros(){
        List<Carro> carros = carroService.getAll();
        return ResponseEntity.ok(carros);
    }

    //ENDPOINT DE SALVAR UM CARRO
    @PostMapping("/adicionar")
    public ResponseEntity<Carro> adicionarCarro(@RequestBody Carro newCarro){
        Carro carroSalvo = carroService.save(newCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroSalvo);
    }

    //ENDPOINT DE DELETAR POR ID
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        carroService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

    //ENDPOINT DE LISTAR POR ID
    @GetMapping("/listar/{id}")
    public ResponseEntity<Carro> listarCarroPorId(@PathVariable Long id){
        Carro carro = carroService.procurarPorId(id);
        return ResponseEntity.ok(carro);
    }

    // @PatchMapping("/alterar")

}
