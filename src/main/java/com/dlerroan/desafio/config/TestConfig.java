package com.dlerroan.desafio.config;

import java.util.Date;

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
		
		Pessoas pessoa1 = new Pessoas(null, "Denys", new Date(), null, 70.8, 1.75, "Brasileiro"); 
		
		pessoasRepository.save(pessoa1);
		
	}
}
