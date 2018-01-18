package com.cadastrocliente;


import com.cadastrocliente.entities.Cliente;
import com.cadastrocliente.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository) {
		return (evt) ->  {
			clienteRepository.save(new Cliente("Adam","adam@boot.com"));
			clienteRepository.save(new Cliente("John","john@boot.com"));
			clienteRepository.save(new Cliente("Smith","smith@boot.com"));
			clienteRepository.save(new Cliente("Edgar","edgar@boot.com"));
			clienteRepository.save(new Cliente("Martin","martin@boot.com"));
			clienteRepository.save(new Cliente("Tom","tom@boot.com"));
			clienteRepository.save(new Cliente("Sean","sean@boot.com"));
		};
	}
}
