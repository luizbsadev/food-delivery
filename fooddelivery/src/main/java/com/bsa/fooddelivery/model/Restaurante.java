package com.bsa.fooddelivery.model;

import com.bsa.fooddelivery.model.dto.CriarRestauranteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "restaurante")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @Embedded
    private Endereco endereco;

    @OneToMany
    private List<Lanche> cardapio;

    public Restaurante(CriarRestauranteDTO dados){
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.endereco = new Endereco(dados.endereco());


    }
}
