package com.cadastrocliente;


import com.cadastrocliente.entities.Cliente;
import com.cadastrocliente.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository) {
		return (evt) ->  {
			clienteRepository.save(new Cliente("André","andre@boot.com"));
			clienteRepository.save(new Cliente("Thiago","thiago@boot.com"));
			clienteRepository.save(new Cliente("Diego","diego@boot.com"));
			clienteRepository.save(new Cliente("Gabriel","gabriel@boot.com"));
			clienteRepository.save(new Cliente("Renan","renan@boot.com"));
			clienteRepository.save(new Cliente("Bruno","bruno@boot.com"));
			clienteRepository.save(new Cliente("Danilo","danilo@boot.com"));
		};
	}
}
