package com.bsa.fooddelivery.repository;

import com.bsa.fooddelivery.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
