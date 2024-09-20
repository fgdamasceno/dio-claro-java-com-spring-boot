package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveImpares {
	 public static void main(String[] args) {
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

	        // Filtrar e remover os números ímpares
	        List<Integer> somentePares = numeros.stream()
	                                            .filter(n -> n % 2 == 0)  // Mantém apenas números pares
	                                            .collect(Collectors.toList()); // Coleta em uma nova lista

	        System.out.println("Lista com apenas números pares: " + somentePares);
	    }
}
