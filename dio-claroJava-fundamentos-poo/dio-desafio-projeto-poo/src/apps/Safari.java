package apps;

import auxiliar.FuncionalidadesAuxiliares;
import entities.NavegadorInternet;

public class Safari extends NavegadorInternet implements FuncionalidadesAuxiliares {

	@Override
	public void favoritar() {
		System.out.println("PAGINA ADICIONADA AOS FAVORITOS");
	}

	@Override
	public void exibirFavoritos() {
		System.out.println("EXIBINDO LISTA DE PAGINAS FAVORITAS");
	}

	@Override
	public void pesquisar() {
		System.out.println("INICIANDO PESQUISA NA WEB...");
	}

	@Override
	public void marcarRecentes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirRecentes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PAGINA " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA GUIA EM BRANCO");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA WEB");
	}

	@Override
	public void salvarHistorico() {
		System.out.println("PAGINA SALVA NO HISTORICO DE NAVEGACAO");
	}

	@Override
	public void exibirHistorico() {
		System.out.println("EXIBINDO HISTORICO DE NAVEGACAO");
	}

}
