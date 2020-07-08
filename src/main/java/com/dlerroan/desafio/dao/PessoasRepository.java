package com.dlerroan.desafio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dlerroan.desafio.entity.Pessoas;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "pessoas", path = "pessoas")
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{

}
