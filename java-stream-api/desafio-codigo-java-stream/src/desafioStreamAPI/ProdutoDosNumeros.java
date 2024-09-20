package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ProdutoDosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular o produto de todos os números da lista
        int produto = numeros.stream()
                             .reduce(1, (a, b) -> a * b); // Utiliza a operação de redução para calcular o produto

        System.out.println("O produto de todos os números da lista é: " + produto);
    }
}
