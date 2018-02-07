package com.cadastrocliente.controller;

import com.cadastrocliente.entities.Cliente;
import com.cadastrocliente.components.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class ClienteController{

    @Autowired
    ClienteService service;

    @RequestMapping( path="/clientes", method = RequestMethod.POST)
    Cliente register(@RequestBody Cliente cliente){
        return service.cadastra(cliente);
    }

    @RequestMapping(path="/clientes", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> get() throws Exception {

        List<Cliente> lista = service.findAllClientes();

        return new ResponseEntity<> (lista, HttpStatus.OK);

    }

    @RequestMapping(value = "clientes/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<List<Cliente>> delete(@PathVariable("id") Long id) throws Exception {

        service.delete(id);

        return new ResponseEntity<> (HttpStatus.OK);

    }
}
