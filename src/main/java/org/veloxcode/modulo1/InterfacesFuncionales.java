package org.veloxcode.modulo1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesFuncionales {

    public void functionLambda(){
        Function<Integer,String> function=s->s.toString();
        String resultado;
        resultado=function.apply(1);
        System.out.println("resultado ::: "+resultado);
    }
    public void PredicateLambda(){
        Predicate<Integer> predicate= s->s>5;
        boolean resultado;
        resultado=predicate.test(1);
        System.out.println("resultado ::: "+resultado);
    }
    public void ConsumerLambda(){
        Consumer<Integer> consumer= s-> System.out.println("resultado ::: "+ s);
        consumer.accept(1);
    }
}
