package com.katho.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.katho.biblioteca.model.Livro;

@Controller
@RequestMapping("/livros")
public class LivrosController {

	@GetMapping
	public String home() {
		
		return "CadastroLivros";
	}
	
	@PostMapping
	public String salvar(Livro livro) {
		
		
		//System.out.println(">>> Saída: " + livro.getTitulo());//só com isso e acrescentano o name com o mesmo nome da propriedade da classe ele já exibe no console o que foi digitado no input
		return "redirect:/livros";
	}
}
