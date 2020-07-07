package com.dlerroan.desafio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dlerroan.desafio.entity.Pessoas;

@RepositoryRestResource
public interface PessoasRepository extends JpaRepository<Pessoas, Integer>{

}
