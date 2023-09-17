package org.veloxcode.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationMap {
    public static void main(String[] args) {
        List<String> cadenaFrutas= Arrays.asList("Manzana","Banana","Cereza","Naranja");
        List<Integer> cadenaLongitud= cadenaFrutas.stream()
                .map(s->s.length())
                .collect(Collectors.toList());
        System.out.println("cadenaLongitud ::: "+cadenaLongitud);
    }
}
