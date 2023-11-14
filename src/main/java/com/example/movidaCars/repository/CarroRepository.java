package com.example.movidaCars.repository;

import com.example.movidaCars.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<CarroModel, Integer> {
}
