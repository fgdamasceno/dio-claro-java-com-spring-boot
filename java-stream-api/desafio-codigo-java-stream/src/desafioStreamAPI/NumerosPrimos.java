package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar os números primos da lista
        List<Integer> primos = numeros.stream()
                .filter(NumerosPrimos::isPrimo) // Filtra os números que são primos
                .collect(Collectors.toList()); // Coleta os números primos em uma lista

        // Exibir o resultado
        System.out.println("Números primos na lista: " + primos);
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
