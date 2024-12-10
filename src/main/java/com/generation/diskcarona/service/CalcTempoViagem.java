package com.generation.diskcarona.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.diskcarona.model.Produto;
import com.generation.diskcarona.repository.ProdutoRepository;

@Service
public class CalcTempoViagem {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Float calcTempoViagem(Optional<Produto> produto, float velo) {

		if (produtoRepository.findById(produto.get().getId()).isPresent()) {

			float tempoTotal;

			tempoTotal = (produto.get().getQuilometragem() / velo) * 60;

			return Math.round(tempoTotal * 100) / 100.0f; 

		}
		return null;

	}
}
