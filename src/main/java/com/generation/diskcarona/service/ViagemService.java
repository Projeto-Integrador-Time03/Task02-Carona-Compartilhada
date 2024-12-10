package com.generation.diskcarona.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.diskcarona.model.Viagem;
import com.generation.diskcarona.repository.ViagemRepository;

@Service
public class ViagemService {

	@Autowired
	private ViagemRepository viagemRepository;

	public Float calcTempoViagem(Optional<Viagem> viagem, float velo) {

		if (viagemRepository.findById(viagem.get().getId()).isPresent()) {

			float tempoTotal;

			tempoTotal = (viagem.get().getQuilometragem() / velo) * 60;

			return Math.round(tempoTotal * 100) / 100.0f; 

		}
		return null;

	}
}
