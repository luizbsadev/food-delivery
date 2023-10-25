package com.bsa.fooddelivery.model;

import com.bsa.fooddelivery.model.dto.EnderecoDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String quadra;
    private String conjunto;
    private String numero;
    private String complemento;

    public Endereco(EnderecoDTO dados){
        this.quadra = dados.quadra();
        this.conjunto = dados.conjunto();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }
}
