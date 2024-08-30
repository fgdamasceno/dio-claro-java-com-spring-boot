import java.util.Scanner;

public class VerificacaoCombo {
	// Funcao para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variaveis booleanas para verificar a contratacao de cada servico
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os servicos contratados
        for (String servico : servicosContratados) {
            if (servico.equals("movel")) {
                movelContratado = true;
            }
            if (servico.equals("banda larga")) {
                bandaLargaContratada = true;
            }
            if (servico.equals("tv")) {
                tvContratada = true;
            }
        }

        // TODO: Verifique se todos os servicos foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuario a lista de servicos contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}

