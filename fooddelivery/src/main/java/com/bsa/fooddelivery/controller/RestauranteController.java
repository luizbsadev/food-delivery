package com.bsa.fooddelivery.controller;

import com.bsa.fooddelivery.model.Restaurante;
import com.bsa.fooddelivery.model.dto.CriarRestauranteDTO;
import com.bsa.fooddelivery.model.dto.DadosDetalhamentoRestauranteDTO;
import com.bsa.fooddelivery.repository.RestauranteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    RestauranteRepository repository;

    @PostMapping
    public ResponseEntity registrarRestaurante(@RequestBody @Valid CriarRestauranteDTO dados, UriComponentsBuilder uriBuilder){
        Restaurante restaurante = new Restaurante(dados);
        repository.save(restaurante);
        URI uri = uriBuilder.path("/restaurante/{id}").buildAndExpand(restaurante.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoRestauranteDTO(restaurante));
    }

}
