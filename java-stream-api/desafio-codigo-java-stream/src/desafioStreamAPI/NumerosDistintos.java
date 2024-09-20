package desafioStreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números da lista são distintos
        boolean todosDistintos = numeros.stream()
                                        .allMatch(new HashSet<>()::add); // Adiciona ao Set e verifica se há duplicatas

        System.out.println("Todos os números da lista são distintos? " + todosDistintos);
    }
}
