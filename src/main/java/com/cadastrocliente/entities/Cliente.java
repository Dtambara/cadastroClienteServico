package com.cadastrocliente.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private String emailCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Cliente(String nomeCliente, String emailCliente) {
        super();
        setNomeCliente(nomeCliente);
        setEmailCliente(emailCliente);

    }

    public Cliente() {

    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", name=" + nomeCliente + ", email=" + emailCliente + "]";
    }
}
