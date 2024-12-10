package com.generation.diskcarona.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.diskcarona.model.Viagem;
import com.generation.diskcarona.repository.ViagemRepository;

import com.generation.diskcarona.service.ViagemService;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/viagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;

	@Autowired

	private ViagemService viagemService;

	@GetMapping
	public ResponseEntity<List<Viagem>> getAll() {
		return ResponseEntity.ok(viagemRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Viagem> getById(@PathVariable Long id) {
		return viagemRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@GetMapping("/tempo-viagem/{id}/{velo}")
	public ResponseEntity<String> calcularTempoDeViagem(@PathVariable Long id, @PathVariable float velo) {

		Optional<Viagem> viagem = viagemRepository.findById(id);


		Float tempoViagem = viagemService.calcTempoViagem(viagem, velo);


		if (tempoViagem == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		String mensagem = "O tempo da viagem é de: " + tempoViagem + " min (" + tempoViagem / 60 + " hrs)";
		return ResponseEntity.ok(mensagem);
	}

	@PostMapping
	public ResponseEntity<Viagem> post(@Valid @RequestBody Viagem produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(viagemRepository.save(produto));
	}

	@PutMapping
	public ResponseEntity<Viagem> put(@Valid @RequestBody Viagem produto) {
		return viagemRepository.findById(produto.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(viagemRepository.save(produto)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Viagem> categoria = viagemRepository.findById(id);

		if (categoria.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);

		viagemRepository.deleteById(id);
	}

}