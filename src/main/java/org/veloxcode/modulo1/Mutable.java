package org.veloxcode.modulo1;

import java.util.ArrayList;
import java.util.List;

public class Mutable {
    public void tipoMutable(){
        // Definir una lista mutable
        List<Integer> miLista = new ArrayList<>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);

        // Modificar la lista existente (estado mutable)
        miLista.add(4);
        System.out.println(miLista); // Esto imprimirá [1, 2, 3, 4]
    }

    public void tipoInmutable(){
        // Definir una lista inmutable
        List<Integer> miLista = new ArrayList<>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);

        // Crear una nueva lista en lugar de modificar la existente (estado inmutable)
        List<Integer> nuevaLista = new ArrayList<>(miLista);
        nuevaLista.add(4);
        System.out.println(nuevaLista); // Esto imprimirá [1, 2, 3, 4]

        // La lista original sigue siendo la misma
        System.out.println(miLista); // Esto imprimirá [1, 2, 3]
    }
}
