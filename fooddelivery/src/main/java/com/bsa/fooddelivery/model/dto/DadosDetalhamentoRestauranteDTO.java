package com.bsa.fooddelivery.model.dto;

import com.bsa.fooddelivery.model.Endereco;
import com.bsa.fooddelivery.model.Restaurante;

public record DadosDetalhamentoRestauranteDTO(Long id, String nome, String descricao, EnderecoDTO endereco) {
    public DadosDetalhamentoRestauranteDTO(Restaurante restaurante){
        this(restaurante.getId(), restaurante.getNome(), restaurante.getDescricao(), new EnderecoDTO(restaurante.getEndereco()));
    }

}
