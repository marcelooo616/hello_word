package com.generation.helloword.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizagem")

public class AprendizagemDaSemana {
	
	@GetMapping 
	public String Aprendizagem() {
		return "MySql => criando o primeiro banco de dados utilizando tabelas relacionadadas○\n"
				+"Spring boot => Primeiro contato com a ferramenta ";
	}

}
