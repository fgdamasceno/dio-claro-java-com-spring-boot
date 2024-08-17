package operadores;

public class Operadores {

	public static void main(String[] args) {

		// OPERADOR DE ATRIBUICAO E REATRIBUICAO (=):
		int numero = 10;
		numero = 20;

		// OPERADORES ARITMÉTICOS (+, -,,, *, /, %)
		// OPERADORES UNARIOS (+, -)
		// OPERADORES DE ATRIBUICAO (++, --):
		int adicao = 5 + 5;
		int unarioPositivo = +adicao;
		int subtracao = 15 - 5;
		int unarioNegativo = -subtracao;
		int multiplicacao = 5 * 5;
		int divisao = 5 / 5;
		int modulo = 5 % 5;
		int incremento = adicao;
		incremento++;
		int decremento = adicao;
		decremento--;
		System.out.println(unarioPositivo);
		System.out.println(unarioNegativo);

		// OPERADORES DE CONCATENACAO (+):
		String primeiroNome = "John ";
		String ultimoNome = "Doe";
		System.out.println(primeiroNome + ultimoNome);

		// OPERADORES DE COMPARACAO (==, !=, <, >, <=, >=):
		int a = 10;
		int b = 5;
		boolean x = a == b;
		System.out.println(x);
		boolean y = a != b;
		System.out.println(y);
		boolean z = a < b;
		System.out.println(z);
		boolean m = a > b;
		System.out.println(m);
		boolean n = a <= b;
		System.out.println(n);
		boolean p = a >= b;
		System.out.println(p);
		

		// OPERADORES LOGICOS (&&, ||, !):
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if (condicao1 && condicao2) {
			System.out.println("A duas sao verdadeiras");
		} else if (condicao1 || condicao2) {
			System.out.println("um das condicoes e verdadeira");
		}

		// OPERADORES TERNARIOS (?:):
		String ternario = 5 < 10 ? "verdadeiro" : "falso"; // utiliza-se com operadores de comparacao
		System.out.println(ternario);

	}

}
