package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar números pares, somá-los e exibir o resultado
        int somaPares = numeros.stream()
                               .filter(n -> n % 2 == 0)   // Filtra apenas os números pares
                               .mapToInt(Integer::intValue) // Converte para int primitivo
                               .sum();                    // Realiza a soma

        System.out.println("Soma dos números pares: " + somaPares);
    }
}
