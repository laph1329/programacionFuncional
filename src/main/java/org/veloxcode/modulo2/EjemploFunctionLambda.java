package org.veloxcode.modulo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploFunctionLambda {
    public static void main(String[] args) {

        //FUNCTION
        List<String> cadenas = Arrays.asList("1", "2", "3", "4", "5");

        // Usamos una expresión lambda con Function para convertir las cadenas en enteros
        List<Integer> enteros = cadenas.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        System.out.println("Lista de enteros: " + enteros);

        //PREDICATE
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usamos una expresión lambda con Predicate para filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);


        //CONSUMER
        List<String> frutas = Arrays.asList("Manzana", "Banana", "Cereza", "Damasco");

        // Usamos una expresión lambda con Consumer para imprimir cada fruta
        frutas.forEach(fruta -> System.out.println("Me gusta la " + fruta));
    }
}
