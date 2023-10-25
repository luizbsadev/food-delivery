package com.bsa.fooddelivery.model.dto;

import com.bsa.fooddelivery.model.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CriarRestauranteDTO(
        @NotBlank
        String nome,
        String descricao,

        @NotNull
        @Valid
        EnderecoDTO endereco) {
}
