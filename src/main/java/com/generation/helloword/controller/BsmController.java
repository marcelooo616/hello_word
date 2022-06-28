package com.generation.helloword.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")

public class BsmController {
	
	@GetMapping
	public String BSM () {
		
		
		return "Mentalidade de Crescimento\n"
				+ "Persistecia\n"
				+ "Responsabilidade Pessoal○\n"
				+ "Orientação ao Futuro\n"
				+ "Comunicação\n"
				+ "Orientação ao Detalhe\n"
				+ "Proatividade\n"
				+ "Trabalho em Equipe";
		
		
		
	}
	
	

}
