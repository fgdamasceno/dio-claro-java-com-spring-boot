package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Agrupador {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupar os valores ímpares que são múltiplos de 3 ou 5
        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra números ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0) // Filtra múltiplos de 3 ou 5
                .collect(Collectors.partitioningBy(n -> n % 2 != 0)); // Agrupa os ímpares

        // Exibir o resultado
        System.out.println("Valores ímpares múltiplos de 3 ou 5: " + agrupados.get(true));
    }
}
