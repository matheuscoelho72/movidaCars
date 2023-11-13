package com.example.movidaCars.controller;

import com.example.movidaCars.model.Cliente;
import com.example.movidaCars.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente){

        return clienteRepository.save(cliente);

    }
}
