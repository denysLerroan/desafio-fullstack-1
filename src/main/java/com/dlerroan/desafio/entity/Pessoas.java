package com.dlerroan.desafio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dados")
public class Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	
	@Column(name = "peso")
	private Double peso;
	
	@Column(name = "altura")
	private Double altura;
	
	@Column(name = "nacionalidade")
	private String nacionalidade;
	
	public Pessoas() {
		
	}
	
	public Pessoas(Long id, String nome, Double peso, Double altura,
			String nacionalidade) {
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}
