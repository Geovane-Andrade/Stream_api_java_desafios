package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 4, 3, 11);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
//

        System.out.println("Os números ímpares da lista são: " + impares);
        System.out.println("Os números pares da lista são: " + pares);
    }
}
