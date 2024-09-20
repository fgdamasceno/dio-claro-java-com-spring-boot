package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParesImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupar os números em pares e ímpares
        Map<Boolean, List<Integer>> paresEImpares = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // Agrupa pares (true) e ímpares (false)

        // Exibir os números pares
        System.out.println("Números pares: " + paresEImpares.get(true));

        // Exibir os números ímpares
        System.out.println("Números ímpares: " + paresEImpares.get(false));
    }
}
