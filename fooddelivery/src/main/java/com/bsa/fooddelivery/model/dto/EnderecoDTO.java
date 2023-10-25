package com.bsa.fooddelivery.model.dto;

import com.bsa.fooddelivery.model.Endereco;
import jakarta.validation.constraints.NotBlank;

public record EnderecoDTO(

        @NotBlank
        String quadra,
        @NotBlank
        String conjunto,
        @NotBlank
        String numero,
        String complemento)
{
        public EnderecoDTO(Endereco endereco){
                this(endereco.getQuadra(), endereco.getConjunto(), endereco.getNumero(), endereco.getComplemento());
        }
}
