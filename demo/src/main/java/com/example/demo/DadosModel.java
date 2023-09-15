package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;



public class DadosModel {
	
	@JsonProperty("nome")	
	private String nome;
	
	@JsonProperty("email")
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
		
	
}
