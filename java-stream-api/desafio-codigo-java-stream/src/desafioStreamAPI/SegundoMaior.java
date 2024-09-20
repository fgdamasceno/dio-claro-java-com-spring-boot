package desafioStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o segundo maior número da lista
        Optional<Integer> segundoMaior = numeros.stream()
                                                .distinct() // Remove duplicatas
                                                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                                                .skip(1) // Ignora o maior número
                                                .findFirst(); // Pega o segundo maior número

        // Exibir o resultado
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número da lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo maior número na lista.");
        }
    }
}
