package org.veloxcode.modulo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperationFilter {
    public static void main(String[] args) {
        List<Integer> cadenaEnteros= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> cadenaPares= cadenaEnteros.stream()
            .filter(s->s%2==0)
            .collect(Collectors.toList());
        System.out.println("cadenaPares ::: "+cadenaPares);

    }
}
