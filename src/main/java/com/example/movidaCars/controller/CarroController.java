package com.example.movidaCars.controller;

import com.example.movidaCars.model.CarroModel;
import com.example.movidaCars.model.ClienteModel;
import com.example.movidaCars.repository.CarroRepository;
import com.example.movidaCars.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public List<CarroModel> listar(){
        return carroRepository.findAll();
    }

    @PostMapping
    public CarroModel adicionarCarro(@RequestBody CarroModel carroModel){

        return carroRepository.save(carroModel);

    }
}
