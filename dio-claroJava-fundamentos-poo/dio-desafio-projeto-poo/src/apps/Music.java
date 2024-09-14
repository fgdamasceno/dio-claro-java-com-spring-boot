package apps;

import auxiliar.FuncionalidadesAuxiliares;
import entities.ReprodutorMusical;

public class Music extends ReprodutorMusical implements FuncionalidadesAuxiliares {

	@Override
	public void favoritar() {
		System.out.println("MARCANDO FAVORITOS");
	}

	@Override
	public void exibirFavoritos() {
		System.out.println("EXIBINDO FAVORITOS");
	}

	@Override
	public void pesquisar() {
		System.out.println("INICIANDO PESQUISA");
	}

	@Override
	public void tocar() {
		System.out.println("INICIANDO REPRODUCAO");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO REPRODUCAO");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("MUSICA ADICIONADA A SELECAO");
	}

	@Override
	public void marcarRecentes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirRecentes() {
		// TODO Auto-generated method stub
		
	}

}
