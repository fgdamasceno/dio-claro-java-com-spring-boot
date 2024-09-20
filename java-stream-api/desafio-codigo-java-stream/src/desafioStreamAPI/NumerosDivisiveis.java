package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumerosDivisiveis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar a soma dos números que são divisíveis por 3 e por 5
        int somaDivisiveisPor3e5 = numeros.stream()
                                          .filter(n -> n % 3 == 0 && n % 5 == 0) // Filtra números divisíveis por 3 e por 5
                                          .mapToInt(Integer::intValue) // Converte os números para int
                                          .sum(); // Soma os números

        System.out.println("A soma dos números divisíveis por 3 e por 5 é: " + somaDivisiveisPor3e5);
    }
}
