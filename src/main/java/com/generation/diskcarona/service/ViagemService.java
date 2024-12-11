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

	public String calcTempoViagem(Long id, float velo) {

		Optional<Viagem> viagem = viagemRepository.findById(id);
		String menssagem;

		if (viagem.isPresent()) {

			float tempoTotal;

			tempoTotal = (viagem.get().getQuilometragem() / velo) * 60;

			int horas = (int) (tempoTotal / 60);
			int minutos = (int) ((tempoTotal % 60));

			if (horas > 0)
				menssagem = ("Tempo estimado: " + horas + " horas e " + minutos + " minutos");
			else
				menssagem = ("Tempo estimado: " + minutos + " minutos");
			return menssagem;

		} else {
			return menssagem = "Não foi possível encontrar a viagem";
		}

	}
}
