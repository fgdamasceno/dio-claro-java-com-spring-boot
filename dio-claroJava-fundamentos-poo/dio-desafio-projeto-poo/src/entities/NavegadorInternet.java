package entities;

public abstract class NavegadorInternet {
	
	public abstract void exibirPagina(String url);
	
	public abstract void adicionarNovaAba();
	
	public abstract void atualizarPagina();
	
	public abstract void salvarHistorico();
	
	public abstract void exibirHistorico();

}
