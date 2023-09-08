package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> somaDosNumerosPares = numeros.stream()
                .filter(numeroPar -> numeroPar % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(somaDosNumerosPares);
    }
}
