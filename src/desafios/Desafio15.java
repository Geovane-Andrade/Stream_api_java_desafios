package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 4, 3,11);
        List<Integer> collect = numeros.stream()
                .distinct()
                .filter(n -> n < 0)
                .collect(Collectors.toList());

        System.out.println("Os números negativos da lista são: " + collect);
    }
}
