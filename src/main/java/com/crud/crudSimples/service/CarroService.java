package com.crud.crudSimples.service;

import com.crud.crudSimples.entity.Carro;
import com.crud.crudSimples.repository.CarroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    // SALVAR
    public Carro save(Carro newCar){
        return carroRepository.save(newCar);
    }

    //LISTAR
    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    //DELETAR POR ID
    public void deletarPorId(Long id){
        carroRepository.deleteById(id);
    }

    //PROCURAR POR ID
    public Carro procurarPorId(Long id){
        return carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro nao encontrado"));
    }

    //ALTERAR

}
