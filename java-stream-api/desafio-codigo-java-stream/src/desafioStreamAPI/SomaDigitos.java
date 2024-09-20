package desafioStreamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                                 .map(n -> String.valueOf(n))      // Converte cada número para String
                                 .flatMapToInt(num -> num.chars()) // Quebra cada número em seus dígitos
                                 .map(Character::getNumericValue)  // Converte cada caractere para seu valor numérico
                                 .sum();                           // Realiza a soma dos dígitos

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDigitos);
    }
}
