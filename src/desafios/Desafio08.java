package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer somaDigitos = numeros.stream()
                .map(n -> Integer.toString(n).length())
                .reduce(0, Integer::sum);
        System.out.println("A soma dos dígitos da lista é: " + somaDigitos);
    }
}
