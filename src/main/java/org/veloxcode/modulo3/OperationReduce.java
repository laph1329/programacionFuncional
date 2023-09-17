package org.veloxcode.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OperationReduce {
    public static void main(String[] args) {
        //ejercicio 1 suma total
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numeros2= Arrays.asList();//sirve de prueba en caso se de una lista vacia

        Optional<Integer> suma = numeros.stream()
                .reduce((x, y) -> x + y);

        if (suma.isPresent()) {
            System.out.println("Suma de los números::: " + suma.get());
        } else {
            System.out.println("El flujo estaba vacío.");
        }
        int sumaConValorInicial = numeros.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sumaConValorInicial ::: " + sumaConValorInicial);

        //ejercico 2 hallar el maximo
        // Utilizando reduce para encontrar el valor máximo
        List<Integer> numerosEnteros = Arrays.asList(12, 45, 3, 67, 8, 90);

        int maximo = numerosEnteros.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));

        System.out.println("El valor máximo en la lista es ::: " + maximo);

        //ejericio 3 hallar la cadena con longitud maxima
        List<String> cadenas = Arrays.asList("manzana", "naranja", "plátano", "kiwi");
        String cadenaMasLarga= cadenas.stream()
                .reduce("",(a,b)->a.length()>b.length()?a:b);
        System.out.println("cadenaMasLarga ::: "+cadenaMasLarga);

        //ejemplo 4 concatenar cadenas
        List<String> cadenas2 = Arrays.asList("manzana", "naranja", "plátano", "kiwi");
        String cadenaConcatenada= cadenas2.stream()
                .reduce("",(a,b)->a.concat(" ").concat(b).toUpperCase());
        System.out.println("cadenaConcatenada ::: "+cadenaConcatenada);

    }
}
