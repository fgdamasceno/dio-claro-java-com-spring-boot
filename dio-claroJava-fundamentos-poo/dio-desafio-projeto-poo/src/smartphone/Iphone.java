package smartphone;

import java.util.Scanner;

import apps.Music;
import apps.Phone;
import apps.Safari;

public class Iphone {

	// DIO -> CLARO - JAVA COM SPRING BOOT
	// DESAFIO DE CODIGO
	// SISTEMA EXEMPLO COM VARIAS OUTRAS FUNCIONALIDADES QUE PODEM SER IMPLEMENTADAS
	// NESTE MESMO SISTEMA

	public static void main(String[] args) {

		Music musicas = new Music();
		Safari navegador = new Safari();
		Phone telefone = new Phone();

		Scanner sc = new Scanner(System.in);

		int app = 0;
		while (app == 0 || app > 3 || app < 0) {
			// IMPLEMENTAR FUNCIONALIDADES
			System.out.printf("Selecione um dos apps:%n1 - Phone%n2 - Music%n3 - Safari%n");
			app = sc.nextInt();

			if (app == 1) {
				System.out.printf("Selecione uma opcao:%n1 - Ligar%n2 - Inciar correio de voz%n");
				int selecaoPhone = sc.nextInt();
				if (selecaoPhone == 1) {
					telefone.ligar("+55 (21) 98765-4321");
				} else if (selecaoPhone == 2) {
					telefone.iniciarCorreioVoz();
				} else {
					System.out.println("Opcao invalida.");
				}
			} else if (app == 2) {
				System.out.printf(
						"Selecione uma opcao:%n1 - Tocar musica%n2 - Pesquisar%n3 - Exibir lista de favoritos%n");
				int selecaoMusica = sc.nextInt();
				if (selecaoMusica == 1) {
					musicas.tocar();
				} else if (selecaoMusica == 2) {
					musicas.pesquisar();
				} else if (selecaoMusica == 3) {
					musicas.exibirFavoritos();
				} else {
					System.out.println("Opcao invalida.");
				}
			} else if (app == 3) {
				System.out
						.printf("Selecione uma opcao:%n1 - Pesquisar%n2 - Adicionar nova aba%n3 - Exibir historico%n");
				int selecaoSafari = sc.nextInt();
				if (selecaoSafari == 1) {
					navegador.pesquisar();
				} else if (selecaoSafari == 2) {
					navegador.adicionarNovaAba();
				} else if (selecaoSafari == 3) {
					navegador.exibirHistorico();
				} else {
					System.out.println("Selecao invalida");
				}
			}

		}

	}

}
