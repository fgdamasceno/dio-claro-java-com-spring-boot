
public class Break {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Dentro do for loop: " + i);
			if (i == 7) {
				System.out.println("BREAK ATIVADO!!!");
				break;
				
			} else {
				System.out.println("Dentro do if/else: " + i);
			}
		}

		System.out.println("\nFim do programa!");

	}

}
