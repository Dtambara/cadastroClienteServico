package com.cadastrocliente.application;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
@Lazy
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByNomeCliente(@Param("nomeCliente") String nomeCliente);
}
