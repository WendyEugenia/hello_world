package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWordld() {
		return "Hello World";
		
	}
	
	@GetMapping("/bsm")
	public String bsmGenerationBrasil() {
		return "Comunicação"
		+ "Mentalidade de Crescimento;\r\n"
		+ "Responsabilidade Pessoal;\n"
		+ "Orientação ao Futuro;\n"
		+ "Trabalho em Equipe;\n"
		+ "Orientação ao Futuro;\n"
		+ "Proatividade;\n"
		+ "Orientação ao Detalhe;\n";
		
	}
	
	@GetMapping("/aprendizado")
	public String aprendizado() {
		return "Habilidades técnicas e trabalho em equipe";
		
	}
}
