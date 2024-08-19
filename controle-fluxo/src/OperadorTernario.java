
public class OperadorTernario {

	public static void main(String[] args) {

		int nota = 7;

		String resultado1 = nota >= 7 ? "Aprovado" : "Reprovado"; // estrutura composta (if, else)
		String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; // estrutura encadeada (if, else if, else) 

		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
