package com.generation.diskcarona.service;

import org.springframework.stereotype.Service;

import com.generation.diskcarona.model.Viagem;

@Service
public class ViagemService {

	public String calcTempoViagem(Viagem viagem, float velo) {

		String menssagem;

		if (viagem!=null) {

			float tempoTotal;

			tempoTotal = (viagem.getQuilometragem() / velo) * 60;

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
