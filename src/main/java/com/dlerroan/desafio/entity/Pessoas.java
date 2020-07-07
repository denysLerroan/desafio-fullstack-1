package com.dlerroan.desafio.entity;

import java.util.Date;

import javax.persistence.*;

import com.dlerroan.desafio.enums.SexoEnum;


@Entity
@Table(name = "pessoas")
public class Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nascimento")
	private Date nascimento;
	
	@Column(name = "sexo")
	private SexoEnum sexo;
	
	@Column(name = "peso")
	private Double peso;
	
	@Column(name = "altura")
	private Double altura;
	
	@Column(name = "nacionalidade")
	private String nacionalidade;
	
	public Pessoas() {
		
	}
	
	public Pessoas(Integer id, String nome, Date nascimento, SexoEnum sexo, Double peso, Double altura,
			String nacionalidade) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
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
