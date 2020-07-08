package com.dlerroan.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dlerroan.desafio.dao.PessoasRepository;
import com.dlerroan.desafio.entity.Pessoas;

@CrossOrigin("http://localhost:4200")
@Service
public class PessoasService {
	
	@Autowired
	private PessoasRepository repository;
	
	public List<Pessoas> findAll(){
		return repository.findAll();
	}
}
