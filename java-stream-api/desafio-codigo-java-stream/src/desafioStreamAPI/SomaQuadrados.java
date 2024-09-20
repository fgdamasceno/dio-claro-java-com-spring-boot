package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular a soma dos quadrados de todos os números da lista
        int somaQuadrados = numeros.stream()
                                   .map(n -> n * n) // Eleva cada número ao quadrado
                                   .reduce(0, Integer::sum); // Realiza a soma

        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaQuadrados);
    }
}
