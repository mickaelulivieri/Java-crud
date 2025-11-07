package com.crud.crudSimples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroController {


    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Boas Vindas";
    }


}
