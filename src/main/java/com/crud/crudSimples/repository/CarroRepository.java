package com.crud.crudSimples.repository;

import com.crud.crudSimples.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
