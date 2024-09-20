package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MediaNumerosMaioresCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar números maiores que 5 e calcular a média
        OptionalDouble media = numeros.stream()
                                      .filter(n -> n > 5)    // Filtra os números maiores que 5
                                      .mapToInt(Integer::intValue) // Converte para int primitivo
                                      .average();            // Calcula a média

        // Exibir o resultado da média, caso exista
        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5.");
        }
    }
}
