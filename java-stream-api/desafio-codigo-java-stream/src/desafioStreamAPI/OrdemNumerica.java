package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdemNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenar a lista usando Stream API e exibir no console
        List<Integer> numerosOrdenados = numeros.stream()
                                                .sorted() // .sorted((a, b) -> a.compareTo(b)) LAMBDA
                                                .collect(Collectors.toList());

        System.out.println("Números ordenados: " + numerosOrdenados);
    }
}

