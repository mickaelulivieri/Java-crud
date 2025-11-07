package com.crud.crudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Enum marca;

    private String modelo;

    private Enum cor;

    private int ano;

    private String quilometragem;

    private String valor;

    private boolean disponível = true;

    @Override
    public String toString() {
        return "Carro [ID: " + id +
                " | Marca: " + marca +
                " | Modelo: " + modelo +
                " | Cor: " + cor +
                " | Ano: " + ano +
                " | Valor: R$" + valor +
                " | Disponível: " + (disponível ? "Sim" : "Não") +
                "]";
    }
}
