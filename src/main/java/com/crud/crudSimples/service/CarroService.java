package com.crud.crudSimples.service;

import com.crud.crudSimples.entity.Carro;
import com.crud.crudSimples.repository.CarroRepository;
import org.springframework.stereotype.Service;

@Service

public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro save(Carro newCar){
        return carroRepository.save(newCar);
    }

}
