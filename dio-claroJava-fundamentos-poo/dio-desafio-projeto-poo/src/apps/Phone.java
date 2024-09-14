package apps;

import auxiliar.FuncionalidadesAuxiliares;
import entities.AparelhoTelefonico;

public class Phone extends AparelhoTelefonico implements FuncionalidadesAuxiliares {

	@Override
	public void favoritar() {
		System.out.println("CONTATO SALVO NOS FAVORITOS");
	}

	@Override
	public void exibirFavoritos() {
		System.out.println("EXIBINDO CONTATOS FAVORITOS");
	}

	@Override
	public void pesquisar() {
		System.out.println("PESQUISANDO NA LISTA DE CONTATOS");
	}

	@Override
	public void marcarRecentes() {
		System.out.println("LIGACAO SALVA NA LISTA DE LIGACOES RECENTES");
	}

	@Override
	public void exibirRecentes() {
		System.out.println("EXIBINDO LISTA DE LIGACOES RECENTES");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("EFETUANDO LIGACAO PARA " + numero);
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGACAO");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

}
