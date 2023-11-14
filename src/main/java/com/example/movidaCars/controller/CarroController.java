package com.example.movidaCars.controller;

import com.example.movidaCars.model.CarroModel;
import com.example.movidaCars.model.UsersModel;
import com.example.movidaCars.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(value = "/findById", method = RequestMethod.GET, params = "id")
    public Optional<CarroModel> listarPorId(Integer id){

        return carroRepository.findById(id);

    }
    @DeleteMapping(value = "/deleteById", params = "id")
    public void removerCarroPorId(Integer id){

        carroRepository.deleteById(id);

    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, params = "id")
    public UsersModel atualizarCarro(@RequestBody UsersModel usersModel){

        return usersModel;

    }
}
