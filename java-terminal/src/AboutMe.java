import java.util.Locale;
import java.util.Scanner;


public class AboutMe {

	public static void main(String[] args) {
		
//		String nome = args[0];
//		String sobrenome = args[1];
//		int idade = Integer.valueOf(args[2]);
//		double altura = Double.valueOf(args[3]);
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = sc.next();
		
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Digite a sua altura:");
		double altura = sc.nextDouble();
		
		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + "cm");

		sc.close();
	}

}
