
public class Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Dentro do for loop: " + i);
			if (i == 7) {
				System.out.println("CONTINUE ATIVADO!!!");
				continue;
			} else {
				System.out.println("Dentro do if/else: " + i);
			}
		}

		System.out.printf("\nFim do programa!");

	}

}
