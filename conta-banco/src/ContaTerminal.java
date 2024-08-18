import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da Agência:");
		String agencia = sc.next();

		System.out.println("Por favor, digite o número da conta:");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Por favor, digite seu nome completo:");
		String nomeCompleto = sc.nextLine();

		System.out.println("Por favor, digite o valor que deseja depositar:");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

		sc.close();
	}

}
