package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GrupoIntervaloNumerico {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar os números que estão entre 5 e 10
        List<Integer> numerosFiltrados = numeros.stream()
                                                .filter(n -> n >= 5 && n <= 10) // Filtra números entre 5 e 10
                                                .collect(Collectors.toList());   // Coleta os resultados em uma nova lista

        System.out.println("Números entre 5 e 10: " + numerosFiltrados);
    }
}
