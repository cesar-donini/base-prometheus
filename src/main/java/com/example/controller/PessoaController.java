package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Pessoa;
import com.example.repository.PessoaRepository;

@Timed
@RestController
@RequestMapping("pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public ResponseEntity<?> get() {
		List<Pessoa> pessoas = pessoaRepository.findAll();
		return ResponseEntity.ok(pessoas);
	}
	
}
