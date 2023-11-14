package com.example.movidaCars.controller;

import com.example.movidaCars.model.UsersModel;
import com.example.movidaCars.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public List<UsersModel> listar(){
        return usersRepository.findAll();
    }

    @PostMapping
    public UsersModel adicionarUsuario(@RequestBody UsersModel usersModel){

        return usersRepository.save(usersModel);

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET, params = "id")
    public Optional<UsersModel> listarPorId(Integer id){

       return usersRepository.findById(id);

    }
    @DeleteMapping(value = "/deleteById", params = "id")
    public void removerUsuarioPorId(Integer id){

        usersRepository.deleteById(id);

    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, params = "id")
    public UsersModel atualizarUsuario(@RequestBody UsersModel usersModel){

        return usersModel;

    }

}
