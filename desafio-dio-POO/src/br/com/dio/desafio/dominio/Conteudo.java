package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10.0;

	// attributes
	private String titulo;
	private String descricao;

	// getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// methods
	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	public abstract double calcularXp();

}
