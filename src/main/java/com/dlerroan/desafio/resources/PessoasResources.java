package com.dlerroan.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlerroan.desafio.entity.Pessoas;
import com.dlerroan.desafio.service.PessoasService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/pessoas")
public class PessoasResources {

	@Autowired
	private PessoasService service;

	@GetMapping
	public ResponseEntity<List<Pessoas>> findAll() {
		List<Pessoas> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
