
public class TiposVariaveis {

	public static void main(String[] args) {
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;		
		System.out.println(numeroCurto2);
		
		// DECLARAÇÃO BASICA DE VARIAVEL. O VALOR PODE SER REATRIBUIDO
		int numero = 10;
		System.out.println(numero); // 10
		numero = 20;
		System.out.println(numero); // 20
		
		// DECLARAÇÃO BASICA DE CONSTANTE. O VALOR NAO PODE SER REATRIBUIDO
		final int IDADE = 41;
		System.out.println(IDADE);
		/*
		 * IDADE = 53;
		 * System.out.println(IDADE);
		 * O código acima gera o seguinte erro:
		 * The final local variable IDADE cannot be assigned. It must be blank and not using a compound assignment		 *        
		 */
		

	}

}
