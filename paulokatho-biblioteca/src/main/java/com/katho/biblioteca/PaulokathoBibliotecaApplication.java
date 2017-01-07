package com.katho.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 
 * @author Katho
 *
 *	Aqui é onde o Spring Boot começa a varrer a aplicação atrás dos Beans e dos objetos necessários para carregar a aplicação.
 */

@RestController
@SpringBootApplication
public class PaulokathoBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaulokathoBibliotecaApplication.class, args);
	}
	
	@RequestMapping("/biblioteca")
	public String ola() {
		
		return "Aê... Primeira aplicação Spring Boot";
	}
}
