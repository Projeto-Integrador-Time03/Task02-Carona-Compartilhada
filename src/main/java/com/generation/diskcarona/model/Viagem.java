package com.generation.diskcarona.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_viagem")
public class Viagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank (message = "A origem é obrigatória")
	private String origem;

	@NotBlank (message = "O destino é obrigatória")
	private String destino;

	@NotNull (message = "A quilometragem é obrigatória")
	private float quilometragem;

	@NotNull (message = "o valor é obrigatória")
	private float valor;

	@ManyToOne
	@JsonIgnoreProperties("viagem")
	private Usuario usuario;

	@ManyToOne
	@JsonIgnoreProperties("viagem")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
