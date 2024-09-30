
public class Main {

	public static void main(String[] args) {
		Cliente nome = new Cliente();
		nome.setNome("Fernando");
		
		Conta cc1 = new ContaCorrente(nome);	
		IConta cc2 = new ContaCorrente(nome);
		Conta cp1 = new ContaPoupanca(nome);
		Conta cp2 = new ContaPoupanca(nome);
		
		cc1.depositar(100);
		cc1.transferir(25, cp1);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		System.out.println();
		CalculadoraInvestimento calc = new CalculadoraInvestimento(1000, 100, 10.65, 12);	
		System.out.println(calc);
	}

}
