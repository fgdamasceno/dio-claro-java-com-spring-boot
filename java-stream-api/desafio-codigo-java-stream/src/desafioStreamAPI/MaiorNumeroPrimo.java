package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número primo da lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(MaiorNumeroPrimo::isPrimo) // Filtra os números primos
                .max(Integer::compareTo); // Encontra o maior número primo

        // Exibir o resultado
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
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
