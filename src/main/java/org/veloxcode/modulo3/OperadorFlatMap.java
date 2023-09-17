package org.veloxcode.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperadorFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listas = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> numeros = listas.stream()
                .flatMap(lista -> lista.stream())
                .collect(Collectors.toList());

        System.out.println("Números aplanados ::: " + numeros);

        //ejemplo 2
        List<String> listaDeCadenas = Arrays.asList("Hola mundo", "Programación funcional");

        List<String> palabras = listaDeCadenas.stream()
                .flatMap(frase -> Arrays.stream(frase.split(" "))) // Divide cada cadena en palabras
                .collect(Collectors.toList());

        System.out.println("palabras separadas ::: "+palabras);

        //ejemplo 3
        List<List<String>> listaDeListasDeCadenas = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );
        List<String> listaCadenasMayusculas =listaDeListasDeCadenas.stream()
                .flatMap(lista ->lista.stream().map((String s)->s.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println("listaCadenasMayusculas ::: "+listaCadenasMayusculas);

        //ejemplo 4
        List<List<String>> listaDeListasDePalabras = Arrays.asList(
                Arrays.asList("gato", "perro", "elefante"),
                Arrays.asList("casa", "coche", "ratón"),
                Arrays.asList("sol", "luna", "estrella")
        );

        List<String> listaPalabras = listaDeListasDePalabras.stream()
                .flatMap(lista -> lista.stream().filter((String s)->s.length()>4))
                .collect(Collectors.toList());
        System.out.println("listaPalabras que tengan más de 4 letras ::: "+listaPalabras);

        //ejemplo 5
        class Persona {
            private String nombre;

            public Persona(String nombre) {
                this.nombre = nombre;
            }

            public String getNombre() {
                return nombre;
            }
        }

        List<Persona> personas = Arrays.asList(
                new Persona("Juan"),
                new Persona("María"),
                new Persona("Pedro")
        );

        List<String> nombres = personas.stream()
                .flatMap(persona -> Stream.of(persona.getNombre())) // Transforma y aplanar
                .collect(Collectors.toList());

        System.out.println("atributo nombre de objetos persona ::: "+nombres);

        //ejemplo 6
        class Curso {
            private String nombre;
            private List<String> estudiantes;

            public Curso(String nombre, List<String> estudiantes) {
                this.nombre = nombre;
                this.estudiantes = estudiantes;
            }

            public String getNombre() {
                return nombre;
            }

            public List<String> getEstudiantes() {
                return estudiantes;
            }
        }

        List<Curso> cursos = Arrays.asList(
                new Curso("Matemáticas", Arrays.asList("Juan", "María", "Pedro")),
                new Curso("Historia", Arrays.asList("Ana", "Carlos")),
                new Curso("Inglés", Arrays.asList("Laura", "David", "Elena"))
        );

        List<String> estudiantes= cursos.stream()
                .flatMap(curso ->curso.getEstudiantes().stream())
                .collect(Collectors.toList());
        System.out.println("todos los estudiantes ::: "+estudiantes);

    }

}
