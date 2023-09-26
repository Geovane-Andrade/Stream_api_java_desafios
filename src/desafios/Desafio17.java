package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);
        List <Integer> integerList = numeros.stream()
                .distinct()
                .filter(n -> {
                    if (n < 2) {
                        return false;
                    }
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
