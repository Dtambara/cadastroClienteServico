package com.cadastrocliente.components;

import com.cadastrocliente.entities.Cliente;
import com.cadastrocliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClienteCadastrar{

    ClienteRepository clienteRepository;
    Sender sender;

    @Autowired
    public ClienteCadastrar(ClienteRepository clienteRepository, Sender sender)
    {
        this.clienteRepository = clienteRepository;
        this.sender = sender;
    }

    public Cliente cadastra(Cliente cliente){
        Optional<Cliente> existingCliente = clienteRepository.findByNomeCliente(cliente.getNomeCliente());
        if (existingCliente.isPresent()){
            throw new RuntimeException("is already exists");
        } else {
            clienteRepository.save(cliente);
            sender.enviaEmail(cliente.getEmailCliente());
        }
        return cliente;
    }
}
