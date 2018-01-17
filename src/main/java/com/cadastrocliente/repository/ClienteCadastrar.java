package com.cadastrocliente.repository;

import com.cadastrocliente.application.ClienteRepository;
import com.cadastrocliente.application.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClienteCadastrar{

    ClienteRepository clienteRepository;

    @Autowired
    public ClienteCadastrar(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastra(Cliente cliente){
        Optional<Cliente> existingCliente = clienteRepository.findByNomeCliente(cliente.getNomeCliente());
        if (existingCliente.isPresent()){
            throw new RuntimeException("is already exists");
        } else {
            clienteRepository.save(cliente);
        }
        return cliente;
    }
}
