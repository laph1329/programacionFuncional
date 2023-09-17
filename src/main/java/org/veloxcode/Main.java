package org.veloxcode;

import org.veloxcode.modulo1.InterfacesFuncionales;
import org.veloxcode.modulo1.Mutable;

public class Main {
    static InterfacesFuncionales interfacesFuncionales= new InterfacesFuncionales();
    public static void main(String[] args) {
        Mutable mutable= new Mutable();
        mutable.tipoInmutable();
        mutable.tipoMutable();
        interfacesFuncionales.functionLambda();
        interfacesFuncionales.PredicateLambda();
        interfacesFuncionales.ConsumerLambda();
    }
}