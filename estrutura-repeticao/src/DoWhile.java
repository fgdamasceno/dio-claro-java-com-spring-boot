import java.util.Random;


public class DoWhile {

	public static void main(String[] args) {
/*
		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 10);
*/
		
		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando");
		}
		while(tocando());

	}
	
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		
		return ! atendeu;
	}

}
