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

	public String calcTempoViagem(Optional<Viagem> viagem, float velo) {

		if (viagemRepository.findById(viagem.get().getId()).isPresent()) {

			float tempoTotal;
			String menssagem;

			tempoTotal = (viagem.get().getQuilometragem() / velo) * 60;

			int horas = (int) (tempoTotal / 60);
			int minutos = (int) ((tempoTotal % 60));

			if (horas > 0)
				menssagem = ("Tempo estimado: " + horas + " horas e " + minutos + " minutos");
			else
				menssagem = ("Tempo estimado: " + minutos + " minutos");
			return menssagem;

		}
		return null;

	}
}
