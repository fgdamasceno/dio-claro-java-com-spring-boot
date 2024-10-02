package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	// attributes
	private LocalDate data;

	// Constructor
	public Mentoria() {

	}

	// getters and setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// Methods
	public double calcularXp() {
		return XP_PADRAO + 20.0;
	}

	@Override
	public String toString() {
		return "Mentoria [" + "titulo=" + getTitulo() +", descricao=" + getDescricao() + ", data=" + getData()
				+ "]";
	}
}
