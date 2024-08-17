package primeirasemana;

public class MinhaClasse {

	public static void main(String[] args) {

		System.out.println("Olá turma, sejam bem-vindos");

		String primeiroNome = "Fernando";
		String ultimoNome = "Damasceno";

		String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

		System.out.println(nomeCompleto);

	}

	public static String nomeCompleto(String primeiroNome, String ultimoNome) {
		return primeiroNome.concat(" ").concat(ultimoNome);
	}

}
