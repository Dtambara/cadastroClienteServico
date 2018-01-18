package com.cadastrocliente.controller;

import com.cadastrocliente.entities.Cliente;
import com.cadastrocliente.components.ClienteCadastrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController{

    @Autowired
    ClienteCadastrar clienteCadastrar;

    @RequestMapping( path="/cadastra", method = RequestMethod.POST)
    Cliente register(@RequestBody Cliente cliente){
        return clienteCadastrar.cadastra(cliente);
    }
}
