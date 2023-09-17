# Programacion Funcional (Java 1.8)

## Módulo 1: Introducción a la Programación Funcional

### 1.1. ¿Qué es la programación funcional?

es un paradigma de programación que se basa en el uso de funciones matemáticas y **evita el estado mutable y los datos mutables.** En lugar de cambiar variables y realizar cambios en el estado del programa, la programación funcional trata de evaluar funciones y expresiones para producir resultados.


###   1.2. Historia de la programación funcional
####  1.2.1. Orígenes
Cálculo Lambda (1930s): El cálculo lambda, desarrollado por el matemático Alonzo Church en la década de 1930, es ampliamente considerado como el punto de partida de la programación funcional. Church creó el cálculo lambda como una notación matemática para representar y estudiar funciones y la recursión. Introdujo conceptos fundamentales como las funciones anónimas y las funciones de orden superior.
####  1.2.2. Evolución
Lisp y Scheme (década de 1950 y 1970):

Lisp: John McCarthy desarrolló Lisp en la década de 1950, y fue uno de los primeros lenguajes de programación en adoptar conceptos funcionales. Lisp se centraba en el uso de listas y funciones recursivas y se convirtió en un lenguaje influyente en la inteligencia artificial y la programación simbólica.
Scheme: Gerald Jay Sussman y Guy L. Steele Jr. desarrollaron Scheme en 1975 como un dialecto de Lisp. Scheme se destacó por su simplicidad y elegancia, y se centraba en la claridad y la ortogonalidad de la sintaxis. Fue influyente en el desarrollo de otros lenguajes, incluyendo JavaScript.
ML (Meta Language) (década de 1970): ML fue desarrollado en la Universidad de Edimburgo por Robin Milner en la década de 1970. Introdujo conceptos como el sistema de tipos polimórficos y la inferencia de tipos, que han influido en muchos lenguajes modernos. Fue un paso importante hacia la programación funcional más tipada.

Haskell (década de 1990): Haskell, desarrollado en la década de 1990, es uno de los lenguajes de programación funcional más conocidos y ampliamente utilizados. Fue creado por un comité de investigación y se basa en una variedad de conceptos funcionales, incluyendo el sistema de tipos estáticos y fuertes. Haskell es conocido por su énfasis en la pureza funcional y la inmutabilidad.

Scala (década de 2000): Scala es un lenguaje de programación desarrollado por Martin Odersky en la década de 2000 que combina programación orientada a objetos y programación funcional. Se ejecuta en la plataforma Java Virtual Machine (JVM) y ha ganado popularidad en el desarrollo de aplicaciones empresariales.

Elm (década de 2010): Elm es un lenguaje de programación funcional puro diseñado para crear aplicaciones web front-end. Se centra en la arquitectura de aplicaciones basada en el modelo de vista actualizada (The Elm Architecture) y ha ganado seguidores en la comunidad de desarrollo web.

### 1.3. Conceptos clave
####  1.3.1. Funciones puras
Se refieren a funciones que cumplen con dos propiedades esenciales: son deterministas y no tienen efectos secundarios.

Determinismo: Una función pura siempre produce el mismo resultado para el mismo conjunto de entradas o argumentos. No importa cuántas veces llames a la función con los mismos argumentos, el resultado será consistente y predecible.

Sin efectos secundarios: Una función pura no realiza ninguna acción que afecte al estado fuera de la función. Esto significa que no modifica variables globales, no realiza operaciones de entrada/salida (como leer o escribir archivos o interactuar con bases de datos) y no produce efectos colaterales observables. La única tarea de una función pura es calcular y devolver un resultado basado en sus entradas.

Las funciones puras tienen varias ventajas:

Son más predecibles y fáciles de razonar, ya que no dependen de un estado externo o de condiciones cambiantes.
Facilitan las pruebas unitarias, ya que puedes probar una función pura con entradas específicas sin preocuparte por efectos secundarios inesperados.
Son candidatas para la optimización y la paralelización, ya que su comportamiento es consistente y no depende de factores externos.
####  1.3.2. Inmutabilidad
se refiere a la incapacidad de cambiar el estado o los valores de un objeto una vez que se han creado. En un contexto de programación funcional, los datos se consideran inmutables, lo que significa que no pueden ser modificados después de su creación. En lugar de modificar los datos existentes, se crean nuevos datos con las modificaciones necesarias.

**Valores no cambiantes:** Los valores inmutables son aquellos cuyos contenidos no pueden ser modificados después de su creación. Por ejemplo, una vez que se crea un número entero con el valor 5, ese número no puede cambiar su valor a menos que se cree una nueva instancia con un valor diferente.

**Creación de copias:** En lugar de modificar directamente los datos, se crean copias de los datos originales con las modificaciones necesarias. Esto garantiza que los datos originales permanezcan inalterados.

**Evita efectos secundarios:** La inmutabilidad contribuye a la creación de funciones puras, que son funciones que no tienen efectos secundarios y siempre producen el mismo resultado para los mismos datos de entrada. Esto facilita la comprensión del comportamiento del código y reduce la posibilidad de errores.

**Hilos y concurrencia:** Los datos inmutables son más seguros en entornos de programación concurrente, ya que no pueden ser modificados por múltiples hilos simultáneamente, lo que evita problemas de sincronización.
####  1.3.3. Funciones de orden superior
Se refieren a funciones que pueden tomar otras funciones como argumentos o devolver funciones como resultados. Esto significa que en un lenguaje de programación que admite funciones de orden superior, las funciones se pueden tratar como **ciudadanos de primera clase**, lo que permite una mayor flexibilidad y abstracción en la escritura de código.

**Ciudadanos de primera clase:** Significa que podemos pasar las funciones como argumentos a otras funciones y devolverlas como resultados de otras funciones

Aquí hay algunos puntos clave sobre las funciones de orden superior:

**Pasar funciones como argumentos:** Puedes pasar una función como argumento a otra función. Esto permite que la función que recibe la función como argumento la utilice para realizar alguna operación específica. Esto se llama "pasar una función como argumento" o "funciones como argumentos".

**Devolver funciones como resultado:** Una función también puede devolver otra función como su resultado. Esto se utiliza para crear funciones más especializadas o personalizadas basadas en ciertos parámetros o condiciones. Esto se llama "devolver una función como resultado" o "funciones como resultados".

**Abstracción de código:** Las funciones de orden superior permiten una mayor abstracción de código. Puedes escribir funciones genéricas que acepten funciones personalizadas como argumentos, lo que hace que tu código sea más reutilizable y flexible.

**Ejemplos comunes:** Algunos ejemplos comunes de funciones de orden superior incluyen map, filter y reduce en el contexto de operaciones en colecciones de datos, como listas o arrays.

####  1.3.4. Efectos secundarios
Los efectos secundarios son cambios observables y potencialmente no deseados que una función o un fragmento de código puede realizar fuera de su ámbito de operación inmediato. En la programación funcional, se busca minimizar o evitar los efectos secundarios en la medida de lo posible, ya que pueden hacer que el código sea menos predecible, más difícil de entender y de depurar.

## Módulo 2: Expresiones Lambda en Java 8
Las expresiones lambda son una característica clave introducida en Java 8 que permite escribir funciones de manera más concisa y expresiva. Las expresiones lambda se utilizan principalmente para trabajar con **interfaces funcionales** en Java, que son interfaces que contienen un solo método abstracto. Estos se conocen comúnmente como "interfaces funcionales".
### 2.1. Introducción a las expresiones lambda
   1. **Sintaxis básica**

      La sintaxis básica de una expresión lambda en Java 8 se asemeja a una función anónima o un bloque de código que se puede pasar como argumento a otro método. La estructura general de una expresión lambda es la siguiente:
            
    java (parameter1, parameter2, ...) -> { cuerpo de la lambda }

parameter1, parameter2, etc., representan los parámetros de entrada de la lambda. Puedes tener cero o más parámetros. -> es el operador lambda que separa la lista de parámetros del cuerpo de la lambda. { cuerpo de la lambda } es el bloque de código que define el comportamiento de la lambda. Este bloque puede contener una o varias declaraciones y expresiones. Ejemplo de una expresión lambda que suma dos números:

    java (int x, int y) -> { return x + y; }
Es importante destacar que, en muchos casos, puedes simplificar aún más una expresión lambda cuando el cuerpo contiene una sola expresión. En este caso, puedes omitir las llaves {} y la instrucción return. La expresión lambda anterior se puede simplificar de la siguiente manera:

    java (int x, int y) -> x + y
En este caso, la expresión lambda toma dos enteros como parámetros y devuelve su suma.

Las expresiones lambda son especialmente útiles cuando trabajas con colecciones de datos o interfaces funcionales, como java.util.function.Predicate, java.util.function.Consumer, java.util.function.Function, etc., que se utilizan comúnmente en operaciones como filter, map, forEach, entre otras, en colecciones de Java. Las expresiones lambda permiten escribir estos fragmentos de código de manera concisa y legible.

Por ejemplo, para filtrar una lista de números para obtener solo los pares en Java 8 utilizando una expresión lambda:

        java List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        java List<Integer> evenNumbers = numbers.stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]
En este ejemplo, n -> n % 2 == 0 es una expresión lambda que actúa como un predicado para filtrar los números pares de la lista numeros.
   2. **Tipos de expresiones lambda**

En Java 8, existen diferentes tipos de expresiones lambda según la interfaz funcional con la que estés trabajando. Cada tipo de expresión lambda se corresponde con una interfaz funcional específica, y el número y tipo de parámetros en la expresión lambda deben coincidir con los parámetros definidos en la interfaz funcional correspondiente.

Aquí te presento algunos de los tipos de expresiones lambda más comunes en Java 8:

**- Expresiones lambda sin parámetros:** Cuando una interfaz funcional no tiene ningún parámetro en su único método abstracto, puedes utilizar una expresión lambda sin parámetros. Por ejemplo
    
            java () -> System.out.println("Hello World");
**- Expresiones lambda con un parámetro:** Si la interfaz funcional tiene un solo parámetro en su único método abstracto, puedes utilizar una expresión lambda con un parámetro. Por ejemplo:
        
                java (int x) -> System.out.println(x);
**- Expresiones lambda con múltiples parámetros:** Si la interfaz funcional tiene múltiples parámetros en su único método abstracto, puedes utilizar una expresión lambda con múltiples parámetros. Por ejemplo:
            
                    java (int x, int y) -> System.out.println(x + y);
**- Expresiones lambda con cuerpo de una sola línea:** Cuando el cuerpo de la expresión lambda contiene una sola expresión, puedes omitir las llaves {} y la instrucción return. Por ejemplo:
                
                        java (int x, int y) -> x + y
**- Expresiones lambda con múltiples líneas:** Si el cuerpo de la expresión lambda contiene más de una línea de código, debes utilizar llaves {} para definir el cuerpo de la expresión lambda. Por ejemplo:
                
                        java (int x, int y) -> {
                        System.out.println("Hello");
                        System.out.println("World");
                        System.out.println(x + y);
                        }
**- Expresiones lambda con tipos de parámetros inferidos:** En algunos casos, puedes omitir el tipo de parámetro en una expresión lambda, ya que el compilador puede inferir el tipo de parámetro en función del contexto. Sin embargo, en algunos casos, es posible que tengas que especificar el tipo de parámetro en la expresión lambda. Por ejemplo:
                    
    java ( x,  y) -> System.out.println(x + y);
**- Expresiones lambda con tipos de parámetros explícitos:** En algunos casos, puedes especificar explícitamente el tipo de parámetro en una expresión lambda. Por ejemplo:
                        
    java (int x, int y) -> System.out.println(x + y);
**- Expresiones lambda como referencias a métodos:** En lugar de proporcionar una expresión lambda con el cuerpo de una función, puedes utilizar una referencia a un método existente si el método tiene una firma compatible. Por ejemplo:
                            
    // Usando una referencia a método para el método "length" de una cadena    
    (String s) -> s.length()
### 2.2. Interfaces funcionales
   1. Interfaz Function
   2. Interfaz Predicate
   3. Interfaz Consumer

3. Ejemplos de uso de expresiones lambda

## Módulo 3: Streams en Java 8
### 3.1. Introducción a los streams
3.1.1. ¿Qué son los streams?
3.1.2. Características de los streams

### 3.2. Operaciones intermedias y terminales
3.2.1. filter
3.2.2. map
3.2.3. flatMap
3.2.4. reduce
3.2.5. collect

### 3.3. Ejemplos de uso de streams

## Módulo 4: Programación Funcional Avanzada en Java 8
4.1. Referencias a métodos y construcción de streams
4.1.1. :: operator
4.1.2. Stream.builder()

4.2. Optional en Java 8
4.2.1. ¿Qué es Optional?
4.2.2. Evitando excepciones NullPointerException

4.3. Composición de funciones
4.3.1. compose y andThen

## Módulo 5: Programación Funcional en Práctica
5.1. Patrones comunes en programación funcional
5.1.1. Recursión
5.1.2. Map-Reduce

5.2. Manejo de excepciones en programación funcional
5.2.1. Manejo de excepciones con try-catch
5.2.2. Either y manejo de errores

## Módulo 6: Biblioteca de Streams Avanzada
6.1. Streams paralelos
6.1.1. Paralelismo en streams
6.1.2. Uso de parallelStream()

6.2. Collectors personalizados
6.2.1. Creación de collectors personalizados
6.2.2. toMap, toSet, y otros collectors predefinidos

## Módulo 7: Diseño Funcional y Pruebas Unitarias
7.1. Diseño de software funcional
7.1.1. Principios SOLID en programación funcional
7.1.2. Inyección de dependencias

7.2. Pruebas unitarias en programación funcional
7.2.1. JUnit y pruebas unitarias
7.2.2. Pruebas de funciones puras
