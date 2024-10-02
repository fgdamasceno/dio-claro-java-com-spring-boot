package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	// attributes
	private int cargaHoraria;
	
	
	// Constructor 
	public Curso() {
		
	}
	
	
	// getters and setters	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

	// Methods
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
