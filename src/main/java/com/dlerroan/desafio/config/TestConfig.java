package com.dlerroan.desafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dlerroan.desafio.dao.PessoasRepository;
import com.dlerroan.desafio.entity.Pessoas;

@Configuration
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PessoasRepository pessoasRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoas pessoa1 = new Pessoas(null, "Denys", 70.3, 1.75, "Brasileiro");
		Pessoas pessoa2 = new Pessoas(null, "Mayara", 52.3, 1.25, "Mexicana");
		
		pessoasRepository.saveAll(Arrays.asList(pessoa1, pessoa2));
		
	}
}
