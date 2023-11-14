package com.example.movidaCars.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.movidaCars.model.ClienteModel;
import com.example.movidaCars.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    //Buscar
    @GetMapping
    public List<ClienteModel> listar(){
        return clienteRepository.findAll();
    }

    //Salvar
    @PostMapping
    public ClienteModel adicionarCliente(@RequestBody ClienteModel clienteModel){

        return clienteRepository.save(clienteModel);

    }

    //Remover
    @RequestMapping(value = "/deleteById", method = RequestMethod.DELETE, params = "id")
    public void removerClienteById(@RequestBody Long id){

        clienteRepository.deleteById(id);

    }

    //Atualizar
}
