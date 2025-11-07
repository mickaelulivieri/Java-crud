package com.crud.crudSimples.service;

import com.crud.crudSimples.entity.Carro;
import com.crud.crudSimples.repository.CarroRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class CarroService {

    private CarroRepository carroRepository;

    public Carro save(Carro newCar){
        return carroRepository.save(newCar);
    }
}
