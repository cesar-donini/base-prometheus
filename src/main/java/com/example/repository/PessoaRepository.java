package com.example.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, UUID> {

	List<Pessoa> findAll();
	
}
