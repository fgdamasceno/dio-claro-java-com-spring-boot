package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class NumeroNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista contém pelo menos um número negativo
        boolean temNegativo = numeros.stream()
                                     .anyMatch(n -> n < 0); // Verifica se existe algum número menor que 0

        System.out.println("A lista contém pelo menos um número negativo? " + temNegativo);
    }
}
