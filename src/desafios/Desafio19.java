package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);
        List<Integer> reduce = numeros.stream()
                .filter(n -> n % 5 == 0 && n % 3 == 0)
                .reduce(Integer::sum)
                .stream().collect(Collectors.toList());

        System.out.println("A soma de divisíveis por 3 e 5 é: " + reduce);
    }
}
