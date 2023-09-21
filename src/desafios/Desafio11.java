package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> collect = numeros.stream()
                .map(n -> n * n)
                .reduce(Integer::sum)
                .stream().collect(Collectors.toList());

        System.out.println(collect);


    }
}
