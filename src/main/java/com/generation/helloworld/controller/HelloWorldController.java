package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWordld() {
		return "Hello World";
		
	}
	
	@GetMapping("/lista-bsm")
	public String listaBsm() {
		return "- BSM Generation Brasil;<br> <br>"
		+ "- Mentalidade de Crescimento;<br>"
		+ "- Responsabilidade Pessoal;<br>"
		+ "- Orientação ao Futuro;<br>"
		+ "- Trabalho em Equipe;<br>"
		+ "- Orientação ao Futuro;<br>"
		+ "- Proatividade;<br>"
		+ "- Orientação ao Detalhe;<br>"
		+ "- Comunicação;<br>";
	}
	
	@GetMapping("/aprendizado")
	public String aprendizado() {
		return "Habilidades técnicas e trabalho em equipe";
		
	}
}
