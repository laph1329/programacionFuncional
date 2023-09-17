# Programación Funcional (Java 1.8) con ChatGPT

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
            
    (parameter1, parameter2, ...) -> { cuerpo de la lambda }

parameter1, parameter2, etc., representan los parámetros de entrada de la lambda. Puedes tener cero o más parámetros. -> es el operador lambda que separa la lista de parámetros del cuerpo de la lambda. { cuerpo de la lambda } es el bloque de código que define el comportamiento de la lambda. Este bloque puede contener una o varias declaraciones y expresiones. Ejemplo de una expresión lambda que suma dos números:

    (int x, int y) -> { return x + y; }
Es importante destacar que, en muchos casos, puedes simplificar aún más una expresión lambda cuando el cuerpo contiene una sola expresión. En este caso, puedes omitir las llaves {} y la instrucción return. La expresión lambda anterior se puede simplificar de la siguiente manera:

    (int x, int y) -> x + y
En este caso, la expresión lambda toma dos enteros como parámetros y devuelve su suma.

Las expresiones lambda son especialmente útiles cuando trabajas con colecciones de datos o interfaces funcionales, como java.util.function.Predicate, java.util.function.Consumer, java.util.function.Function, etc., que se utilizan comúnmente en operaciones como filter, map, forEach, entre otras, en colecciones de Java. Las expresiones lambda permiten escribir estos fragmentos de código de manera concisa y legible.

Por ejemplo, para filtrar una lista de números para obtener solo los pares en Java 8 utilizando una expresión lambda:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]
En este ejemplo, n -> n % 2 == 0 es una expresión lambda que actúa como un predicado para filtrar los números pares de la lista numeros.
   2. **Tipos de expresiones lambda**

En Java 8, existen diferentes tipos de expresiones lambda según la interfaz funcional con la que estés trabajando. Cada tipo de expresión lambda se corresponde con una interfaz funcional específica, y el número y tipo de parámetros en la expresión lambda deben coincidir con los parámetros definidos en la interfaz funcional correspondiente.

Aquí te presento algunos de los tipos de expresiones lambda más comunes en Java 8:

**- Expresiones lambda sin parámetros:** Cuando una interfaz funcional no tiene ningún parámetro en su único método abstracto, puedes utilizar una expresión lambda sin parámetros. Por ejemplo
    
            () -> System.out.println("Hello World");
**- Expresiones lambda con un parámetro:** Si la interfaz funcional tiene un solo parámetro en su único método abstracto, puedes utilizar una expresión lambda con un parámetro. Por ejemplo:
        
                (int x) -> System.out.println(x);
**- Expresiones lambda con múltiples parámetros:** Si la interfaz funcional tiene múltiples parámetros en su único método abstracto, puedes utilizar una expresión lambda con múltiples parámetros. Por ejemplo:
            
                    (int x, int y) -> System.out.println(x + y);
**- Expresiones lambda con cuerpo de una sola línea:** Cuando el cuerpo de la expresión lambda contiene una sola expresión, puedes omitir las llaves {} y la instrucción return. Por ejemplo:
                
                        (int x, int y) -> x + y
**- Expresiones lambda con múltiples líneas:** Si el cuerpo de la expresión lambda contiene más de una línea de código, debes utilizar llaves {} para definir el cuerpo de la expresión lambda. Por ejemplo:
                
                        (int x, int y) -> {
                        System.out.println("Hello");
                        System.out.println("World");
                        System.out.println(x + y);
                        }
**- Expresiones lambda con tipos de parámetros inferidos:** En algunos casos, puedes omitir el tipo de parámetro en una expresión lambda, ya que el compilador puede inferir el tipo de parámetro en función del contexto. Sin embargo, en algunos casos, es posible que tengas que especificar el tipo de parámetro en la expresión lambda. Por ejemplo:
                    
    ( x,  y) -> System.out.println(x + y);
**- Expresiones lambda con tipos de parámetros explícitos:** En algunos casos, puedes especificar explícitamente el tipo de parámetro en una expresión lambda. Por ejemplo:
                        
    (int x, int y) -> System.out.println(x + y);
**- Expresiones lambda como referencias a métodos:** En lugar de proporcionar una expresión lambda con el cuerpo de una función, puedes utilizar una referencia a un método existente si el método tiene una firma compatible. Por ejemplo:
                            
    // Usando una referencia a método para el método "length" de una cadena    
    (String s) -> s.length()
### 2.2. Interfaces funcionales
   1. **Interfaz Function**

      La interfaz funcional Function es una de las interfaces más utilizadas en Java 8 y representa una función que toma un argumento de un tipo dado y produce un resultado de otro tipo. En otras palabras, Function representa una función que toma un valor de entrada y devuelve un valor de salida. Esta interfaz es parte del paquete java.util.function.

      La interfaz Function tiene un método abstracto llamado **"apply"**, que toma un argumento del tipo especificado y devuelve un resultado del tipo especificado. Su firma se ve así:
                
            R apply(T t);
      T es el tipo del argumento de entrada.
      R es el tipo del resultado.
      La interfaz Function es parametrizada por dos tipos: T y R. Aquí tienes un ejemplo de cómo usar la interfaz Function:
                
            import java.util.function.Function;

            public class EjemploFunction {
            public static void main(String[] args) {
            // Definimos una función que convierte una cadena en un entero
            Function<String, Integer> funcionConversion = s -> Integer.parseInt(s);
    
            // Usamos la función para convertir una cadena en un entero
            String numeroComoCadena = "123";
            Integer numero = funcionConversion.apply(numeroComoCadena);
    
            System.out.println("Número como cadena: " + numeroComoCadena);
            System.out.println("Número como entero: " + numero);
            }
            }
      La interfaz Function es especialmente útil cuando necesitas transformar datos de un tipo a otro, como convertir un tipo de dato a otro, aplicar una operación matemática a un valor, o cualquier otra transformación de datos que requiera un valor de entrada y produzca un valor de salida. Esta interfaz es ampliamente utilizada en operaciones de mapeo (map) en flujos (Stream) de Java, entre otros casos.

   2. **Interfaz Predicate**

      La interfaz funcional Predicate es otra de las interfaces funcionales proporcionadas por Java 8 y se encuentra en el paquete java.util.function. Esta interfaz se utiliza para representar una función que toma un argumento de un tipo dado y devuelve un valor booleano (true o false). En otras palabras, un Predicate representa una condición o una prueba que se realiza en un objeto de un tipo especificado para determinar si cumple con ciertas condiciones.

      La interfaz Predicate tiene un método abstracto llamado **"test"**, que toma un argumento del tipo especificado y devuelve un valor booleano (true si la condición se cumple y false si no). Su firma se ve así:
                    
                boolean test(T t);
      T es el tipo del argumento que se va a evaluar.
      Aquí tienes un ejemplo de cómo usar la interfaz Predicate:      
      
               import java.util.function.Predicate;

               public class EjemploPredicate {
               public static void main(String[] args) {
               // Definimos un Predicate para verificar si un número es par
               Predicate<Integer> esPar = numero -> numero % 2 == 0;

               // Probamos el Predicate con varios números
               System.out.println("¿Es 4 par? " + esPar.test(4)); // true
               System.out.println("¿Es 7 par? " + esPar.test(7)); // false
               }
               }
      La interfaz Predicate es útil en situaciones donde necesitas evaluar una condición sobre un valor, como filtrar elementos de una lista que cumplan con cierta condición o validar datos de entrada en un programa.

      En resumen, Predicate es una interfaz funcional que representa una condición o una prueba booleana sobre un valor de entrada, y se utiliza comúnmente en situaciones en las que se necesita evaluar o filtrar datos basados en una condición.

   3. **Interfaz Consumer**
      
      La interfaz funcional Consumer es otra de las interfaces proporcionadas por Java 8 y se encuentra en el paquete java.util.function. Esta interfaz se utiliza para representar una función que toma un argumento de un tipo especificado y no devuelve ningún resultado explícito. En otras palabras, un Consumer representa una operación o acción que se realiza en un objeto de un tipo especificado, pero no produce un valor de salida.

      La interfaz Consumer tiene un método abstracto llamado **"accept"**, que toma un argumento del tipo especificado y realiza una operación sobre él sin devolver ningún valor. Su firma se ve así:
       
             void accept(T t);
      T es el tipo del argumento que se va a consumir.
      Aquí tienes un ejemplo de cómo usar la interfaz Consumer:
      

        import java.util.function.Consumer;
        
        public class EjemploConsumer {
        public static void main(String[] args) {
        // Definimos un Consumer que imprime el valor recibido
        Consumer<String> imprimirTexto = texto -> System.out.println(texto);
        
        // Usamos el Consumer para imprimir texto
        imprimirTexto.accept("Hola, mundo!");
        imprimirTexto.accept("Java 8 es genial");
        }
        }

La interfaz Consumer es útil en situaciones donde necesitas realizar una acción o una operación en un objeto, pero no necesitas devolver ningún valor. Puede ser utilizado en operaciones como forEach en colecciones, donde se desea aplicar una acción a cada elemento de la colección.

En resumen, Consumer es una interfaz funcional que representa una operación que toma un argumento y no devuelve ningún valor explícito, y se utiliza comúnmente para realizar acciones en objetos en lugar de producir resultados.  
   4. **Ejemplos de uso de expresiones lambda**

**"Los ejemplos estan en el package módulo1, la clase 'EjemploFunctionLamnbda'"**

## Módulo 3: Streams en Java 8
### 3.1. Introducción a los streams
**3.1.1. ¿Qué son los streams?**

Los streams en Java 8 son una característica que permite procesar secuencias de elementos de manera eficiente y declarativa. En esencia, un stream es una secuencia de elementos que puede ser procesada en paralelo o en serie de una manera similar a una tubería (pipeline) de datos.

Aquí hay algunas características clave de los streams:

**Secuencia de elementos:** Un stream representa una secuencia de elementos. Estos elementos pueden ser objetos de cualquier tipo, como números, cadenas, objetos personalizados, etc.

**Operaciones de alto nivel:** Los streams proporcionan una serie de operaciones de alto nivel que permiten realizar operaciones de transformación, filtrado, agrupación, ordenación y reducción en la secuencia de elementos. Estas operaciones son declarativas y se aplican a todos los elementos del stream.

**No son estructuras de datos:** Los streams no almacenan datos por sí mismos. En cambio, permiten realizar operaciones en los datos mientras se mantienen almacenados en sus fuentes originales (como listas, arrays o colecciones).

**Lazy evaluation:** Los streams utilizan la evaluación perezosa (lazy evaluation), lo que significa que las operaciones en un stream no se realizan hasta que se necesita un resultado concreto. Esto puede mejorar la eficiencia al evitar el cálculo innecesario.

**Posibilidad de paralelismo:** Los streams ofrecen la posibilidad de realizar operaciones en paralelo en múltiples núcleos de CPU, lo que puede acelerar el procesamiento de grandes conjuntos de datos.

**Pipelines de operaciones:** Puedes construir tuberías (pipelines) de operaciones en un stream, lo que significa que puedes encadenar varias operaciones juntas para realizar un procesamiento más complejo en una sola línea de código.

Para empezar a usar streams en Java 8, primero debes obtener un stream desde una fuente de datos, como una lista o un array, utilizando métodos como stream() o parallelStream(). Luego, puedes encadenar operaciones en ese stream para realizar el procesamiento deseado.

En resumen, los streams en Java 8 son una característica poderosa que permite procesar secuencias de elementos de manera eficiente y declarativa, facilitando la manipulación y transformación de datos de manera más concisa y legible en comparación con enfoques tradicionales.

**3.1.2. Características de los streams**

Las características de los streams en Java se refieren a las propiedades y capacidades que proporciona esta API para el procesamiento de secuencias de datos de manera más eficiente y expresiva. A continuación, se presentan algunas de las características clave de los streams en Java:

**Secuencia de datos:** Los streams representan una secuencia de datos que pueden ser elementos individuales o elementos de una colección, como una lista o un conjunto. Los streams permiten procesar estos datos de manera uniforme y declarativa.

**Operaciones intermedias:** Los streams admiten operaciones intermedias, como filter, map, flatMap, distinct, sorted y peek, que se pueden encadenar para transformar, filtrar o manipular los datos en la secuencia. Estas operaciones no producen un resultado final de inmediato, sino que generan un nuevo stream.

**Operaciones terminales:** Las operaciones terminales, como forEach, collect, reduce, min, max y count, se utilizan para obtener un resultado final o llevar a cabo una acción en el stream. Después de una operación terminal, el stream se cierra y no se puede utilizar nuevamente.

**Procesamiento paralelo:** Los streams permiten el procesamiento paralelo de datos mediante el uso de múltiples hilos, lo que puede mejorar significativamente el rendimiento en sistemas multicore. Para activar el procesamiento paralelo, se pueden usar las operaciones parallel() o parallelStream().

**Lazy Evaluation (Evaluación perezosa):** Los streams utilizan una evaluación perezosa, lo que significa que las operaciones no se ejecutan hasta que se invoque una operación terminal. Esto permite que Java optimice el procesamiento y evite realizar cálculos innecesarios.

**Pipelines de operaciones:** Puedes construir pipelines de operaciones encadenando múltiples operaciones intermedias y terminales en un solo flujo de código, lo que facilita la escritura de código limpio y expresivo.

**Compatibilidad con tipos primitivos:** Los streams en Java ofrecen versiones especializadas para tipos primitivos (por ejemplo, IntStream, LongStream, DoubleStream), lo que reduce la sobrecarga de almacenamiento y mejora el rendimiento al trabajar con datos primitivos.

**Manipulación de colecciones:** Los streams pueden operar en colecciones y estructuras de datos, lo que facilita el procesamiento de datos en listas, conjuntos, mapas y otras estructuras.

**Compatibilidad con API funcional:** Los streams son compatibles con expresiones lambda, lo que permite escribir código más conciso y funcional para el procesamiento de datos.

En conjunto, estas características hacen que los streams en Java sean una herramienta poderosa y versátil para el procesamiento de datos, lo que facilita la escritura de código más claro y eficiente en comparación con enfoques tradicionales basados en bucles.

### 3.2. Operaciones intermedias y terminales
En Java 8 Streams, las operaciones se dividen en dos categorías principales: operaciones intermedias y operaciones terminales. Las operaciones intermedias son aquellas que se pueden encadenar en un flujo (stream) y que no producen un resultado final hasta que se encuentre una operación terminal. Una de las operaciones intermedias más comunes es filter.

**3.2.1. filter**

La operación filter se utiliza para filtrar elementos de un flujo (stream) en función de una condición especificada mediante un predicado. El resultado es un nuevo flujo que contiene solo los elementos que cumplen con la condición del predicado.

La firma de la operación filter es la siguiente:

```Stream<T> filter(Predicate<? super T> predicate)```

predicate es un predicado que especifica la condición que debe cumplir un elemento para ser incluido en el nuevo flujo.

Aquí hay un ejemplo de cómo utilizar la operación filter para filtrar números pares de un flujo de enteros:

      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;
      
      public class EjemploFilter {
      public static void main(String[] args) {

      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
        }
      }

En este ejemplo, el método filter se utiliza para crear un nuevo flujo que contiene solo los números pares de la lista original numeros. El predicado numero -> numero % 2 == 0 verifica si un número es par y solo los números que cumplen con esta condición se incluirán en el nuevo flujo.

Finalmente, utilizamos collect para recopilar los elementos filtrados en una lista pares.

La operación filter es útil para reducir el tamaño de un flujo eliminando elementos que no cumplan con una cierta condición, lo que puede ser útil en diversas situaciones de procesamiento de datos.

**3.2.2. map**

La operación map es otra de las operaciones intermedias en Java 8 Streams. Se utiliza para transformar cada elemento de un flujo (stream) en otro elemento mediante la aplicación de una función dada. El resultado es un nuevo flujo que contiene los elementos transformados.

La firma de la operación map es la siguiente:

```<R> Stream<R> map(Function<? super T, ? extends R> mapper)```

mapper es una función que toma un elemento de tipo T del flujo original y devuelve un nuevo elemento de tipo R que representa la transformación deseada.

Aquí tienes un ejemplo de cómo usar la operación map para transformar una lista de cadenas en una lista de sus longitudes (número de caracteres):

      import java.util.Arrays;
      import java.util.List;
      import java.util.stream.Collectors;
      
      public class EjemploMap {
      public static void main(String[] args) {
      List<String> cadenas = Arrays.asList("Manzana", "Banana", "Cereza", "Damasco");
      
              List<Integer> longitudes = cadenas.stream()
                      .map(cadena -> cadena.length())
                      .collect(Collectors.toList());
      
              System.out.println("Longitudes de las cadenas: " + longitudes);
          }
      }

En este ejemplo, la operación map se utiliza para crear un nuevo flujo que contiene las longitudes de las cadenas en la lista original cadenas. La función cadena -> cadena.length() toma cada cadena y devuelve su longitud, lo que resulta en un flujo de longitudes. Luego, utilizamos collect para recopilar estas longitudes en una lista longitudes.

La operación map es útil cuando necesitas transformar elementos de un flujo en otro tipo de elemento o realizar algún tipo de procesamiento en cada elemento del flujo. Puedes usarla para mapear elementos de una forma a otra de manera eficiente y concisa.

**3.2.3. flatMap**

La operación flatMap es una operación intermedia en Java 8 Streams que se utiliza para transformar y aplanar un flujo (stream) de elementos en otro flujo. A menudo se utiliza cuando tienes una estructura de datos anidada o una colección de colecciones y deseas convertirla en un solo flujo de elementos. La operación flatMap aplica una función que devuelve un flujo (stream) para cada elemento del flujo original y luego aplanará estos flujos en un único flujo resultante.

La firma de la operación flatMap es la siguiente:

```<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)```

mapper es una función que toma un elemento de tipo T del flujo original y devuelve un nuevo flujo de elementos de tipo R. Este flujo se aplanará en el flujo resultante.
La principal diferencia entre map y flatMap radica en cómo manejan la estructura del flujo devuelto por la función mapper:

map aplica la función y envuelve el resultado en un nuevo flujo, lo que da como resultado un flujo de flujos.
flatMap aplica la función y luego aplanará los flujos resultantes en un único flujo.
Aquí tienes un ejemplo de cómo usar la operación flatMap para aplanar una lista de listas de números en un solo flujo de números:

            import java.util.Arrays;
            import java.util.List;
            import java.util.stream.Collectors;
            
            public class EjemploFlatMap {
            public static void main(String[] args) {
            List<List<Integer>> listas = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
            );
      
              List<Integer> numeros = listas.stream()
                      .flatMap(lista -> lista.stream())
                      .collect(Collectors.toList());
      
              System.out.println("Números aplanados: " + numeros);
                  }
            }

En este ejemplo, listas es una lista de listas de números. Utilizamos flatMap para aplanar estas listas en un solo flujo de números. La función lista -> lista.stream() toma cada lista interna y la convierte en un flujo, y luego flatMap combina estos flujos en uno solo. Finalmente, utilizamos collect para recopilar los números en una lista numeros.

La operación flatMap es útil cuando trabajas con estructuras de datos anidadas o cuando necesitas combinar múltiples flujos en uno solo, como en el caso de listas de listas o colecciones de colecciones.


**3.2.4. reduce**


La operación reduce es una **operación terminal** en Java 8 Streams que se utiliza para **combinar los elementos de un flujo** (stream) en **un solo resultado**, aplicando una función de reducción. Esta operación es extremadamente versátil y se puede usar para realizar una variedad de tareas de agregación, como suma, multiplicación, concatenación de cadenas, encontrar el valor máximo o mínimo, entre otros.

La firma de la operación reduce es la siguiente:

```Optional<T> reduce(BinaryOperator<T> accumulator)```

accumulator es una función binaria que toma dos elementos de tipo T y devuelve un nuevo elemento de tipo T. Esta función se utiliza para combinar los elementos del flujo uno por uno.
reduce devuelve un Optional que contiene el resultado de la operación de reducción. El Optional es necesario porque el flujo podría estar vacío, y en ese caso, no habría ningún valor para reducir.

Aquí hay un ejemplo de cómo usar la operación reduce para calcular la suma de una lista de números:

            import java.util.Arrays;
            import java.util.List;
            import java.util.Optional;
            
            public class EjemploReduce {
                  public static void main(String[] args) {
                    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            
                    Optional<Integer> suma = numeros.stream()
                            .reduce((x, y) -> x + y);
            
                    if (suma.isPresent()) {
                        System.out.println("Suma de los números: " + suma.get());
                    } else {
                        System.out.println("El flujo estaba vacío.");
                    }
                  }
            }

En este ejemplo, utilizamos reduce para calcular la suma de los números en la lista numeros. La función (a, b) -> a + b toma dos números y devuelve su suma. reduce combina los elementos del flujo uno por uno utilizando esta función y devuelve un Optional que contiene el resultado de la suma.

Es importante mencionar que también puedes proporcionar un valor inicial (identidad) como argumento adicional a reduce si deseas un valor predeterminado en caso de que el flujo esté vacío. Por ejemplo:

            Optional<Integer> suma = numeros.stream()
                    .reduce(0, (x, y) -> x + y);

En este caso, el valor inicial es 0, por lo que si el flujo está vacío, el resultado de la suma será 0.

La operación reduce es fundamental para realizar operaciones de agregación en flujos de elementos y es muy útil en una variedad de situaciones de procesamiento de datos.

**3.2.5. collect**

La operación collect es una **"operación terminal"** en Java 8 Streams que se utiliza para acumular o recopilar elementos de un flujo (stream) en una colección o en otro tipo de estructura de datos mutable. Esta operación es particularmente útil cuando deseas tomar los elementos de un flujo y reunirlos en una lista, conjunto, mapa u otra estructura de datos para su posterior procesamiento o análisis.

La firma de la operación collect es la siguiente:

      <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)

supplier es una función que proporciona una nueva instancia de la colección o estructura de datos en la que se recopilarán los elementos del flujo.

accumulator es una función que combina un elemento del flujo con la estructura de datos acumulativa. Toma dos argumentos: la estructura acumulativa y el elemento del flujo, y agrega el elemento a la estructura.

combiner es una función que combina dos estructuras de datos acumulativas en una sola. Esto es relevante cuando se realiza una operación de reducción en paralelo.

Aquí hay un ejemplo de cómo usar la operación collect para recopilar elementos de un flujo en una lista:

            import java.util.Arrays;
            import java.util.List;
            import java.util.stream.Collectors;
            
            public class EjemploCollect {
            public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            
            List<Integer> numerosPares = numeros.stream()
                    .filter(numero -> numero % 2 == 0)
                    .collect(Collectors.toList());
            
            System.out.println("Números pares: " + numerosPares);
            }
            }

En este ejemplo, utilizamos collect para recopilar las cadenas del flujo frutas en una lista. La operación Collectors.toList() proporciona una instancia de ArrayList que recopila los elementos en una lista.

Además de Collectors.toList(), Java 8 proporciona métodos en la clase Collectors para recopilar elementos en otras estructuras de datos, como conjuntos, mapas, etc. Puedes personalizar la operación de recopilación según tus necesidades utilizando collect.

La operación collect es muy versátil y te permite reunir elementos de un flujo en la estructura de datos que mejor se adapte a tu situación particular. Es ampliamente utilizada en el procesamiento de flujos para acumular resultados o transformar los datos en una forma más útil para su posterior procesamiento.

### 3.3. Ejemplos de uso de streams

## Módulo 4: Programación Funcional Avanzada en Java 8
**4.1. Referencias a métodos y construcción de streams**

**- Referencias a métodos**

  En Java 8, las referencias a métodos son una característica que te permite referenciar métodos existentes o constructores de manera más concisa. Son especialmente útiles cuando trabajas con expresiones lambda que simplemente llaman a un método existente. Hay cuatro tipos de referencias a métodos:

**Referencia a un método estático:** Permite referenciar un método estático existente.

      // Sintaxis: Clase::métodoEstático
      Function<String, Integer> referencia = Integer::parseInt;

**Referencia a un método de instancia de un objeto en particular:** Permite referenciar un método de instancia de un objeto específico.

        // Sintaxis: objeto::métodoDeInstancia
        String nombre = "John Doe";
        Consumer<String> referencia = nombre::startsWith;

**Referencia a un método de instancia de un objeto arbitrario de un tipo particular:** Permite referenciar un método de instancia de un objeto arbitrario de un tipo específico.

        // Sintaxis: Tipo::métodoDeInstancia
        List<String> nombres = Arrays.asList("John", "Jane", "Mary");
        Collections.sort(nombres, String::compareToIgnoreCase);

**Referencia a un constructor:** Permite referenciar un constructor existente.
    
            // Sintaxis: Tipo::new
            Supplier<List<String>> referencia = ArrayList::new;

**- Construcción de streams**

En este módulo, también aprenderás a construir streams en Java 8. Los streams se pueden crear desde una variedad de fuentes de datos, incluyendo colecciones, arrays y generadores infinitos. Algunas de las formas comunes de construir streams son:

**Usar el método stream() en colecciones:** Puedes obtener un stream de una colección llamando al método stream() en dicha colección.

        List<String> nombres = Arrays.asList("John", "Jane", "Mary");
        Stream<String> flujo = nombres.stream();

**Usar el método stream() en arrays:** También puedes obtener un stream de un array utilizando el método stream().

            String[] nombres = {"John", "Jane", "Mary"};
            Stream<String> flujo = Arrays.stream(nombres);

**Usar el método Stream.of():** Puedes crear un stream a partir de elementos individuales o arrays utilizando el método Stream.of().

                Stream<String> flujo = Stream.of("John", "Jane", "Mary");
                Stream<Integer> flujo = Stream.of(1, 2, 3, 4, 5);
                Stream<String> flujo = Stream.of(nombres);

**Generar un stream infinito:** Puedes generar un stream infinito utilizando el método Stream.generate() y proporcionando un Supplier que genere elementos.

            Stream<String> flujoInfinito = Stream.generate(() -> "John");

**Generar un stream con elementos secuenciales:** Puedes generar un stream con elementos secuenciales utilizando el método Stream.iterate() y proporcionando un valor inicial y una función de iteración.

            Stream<Integer> flujoSecuencial = Stream.iterate(1, n -> n + 1);

**Usar el método parallelStream() en colecciones:** Puedes obtener un stream paralelo de una colección llamando al método parallelStream() en dicha colección.

        List<String> nombres = Arrays.asList("John", "Jane", "Mary");
        Stream<String> flujoParalelo = nombres.parallelStream();

**4.1.1. :: operator**

El operador :: en Java se utiliza para crear referencias a métodos o constructores. Es una característica introducida en Java 8 que simplifica la llamada a métodos existentes o la referencia a constructores en expresiones lambda o en otras situaciones donde necesitas una instancia de una interfaz funcional.


**4.1.2. Stream.builder()**

Stream.builder() es una forma de construir un Stream de manera más controlada y dinámica, especialmente cuando no tienes todos los elementos disponibles de antemano y deseas agregar elementos al stream a medida que avanzas en tu código.

Para utilizar Stream.builder(), sigues estos pasos:

Creas un objeto Stream.Builder<T> utilizando el método estático Stream.builder().

Agregas elementos al builder utilizando el método add(T t).

Cuando hayas agregado todos los elementos necesarios, construyes el Stream llamando al método build() en el builder.

Aquí tienes un ejemplo de cómo usar Stream.builder() para construir un Stream de cadenas dinámicamente:

      Stream.Builder<String> builder = Stream.builder();
      builder.add("Manzana");
      builder.add("Banana");
      builder.add("Cereza");
      
      // Agregar más elementos si es necesario
      
      Stream<String> stream = builder.build();

En este ejemplo, creamos un Stream.Builder<String> utilizando Stream.builder(). Luego, agregamos tres cadenas al builder utilizando el método add(). Finalmente, construimos el Stream llamando al método build() en el builder.

Stream.builder() te brinda un mayor control sobre la construcción de un Stream y te permite adaptarte a situaciones donde los elementos no están disponibles de inmediato en una colección o fuente de datos.


**4.2. Optional en Java 8**
**4.2.1. ¿Qué es Optional?**

Optional es una clase introducida en Java 8 para abordar el problema de las excepciones NullPointerException al trabajar con valores que pueden ser nulos. Representa un envoltorio (wrapper) para un valor que puede ser nulo o no nulo. La idea detrás de Optional es proporcionar una forma más segura y declarativa de manejar los valores nulos, evitando así las excepciones NullPointerException que pueden causar errores en tiempo de ejecución.

Algunos conceptos clave relacionados con Optional:

Presente (Present) y Ausente (Empty): Un objeto Optional puede estar presente, lo que significa que contiene un valor no nulo, o puede estar ausente, lo que significa que no contiene ningún valor.

Operaciones seguras: Optional proporciona una serie de operaciones seguras para trabajar con sus valores, como get(), isPresent(), ifPresent(), orElse(), orElseGet(), orElseThrow(), entre otras.

Evita NullPointerException: Al utilizar Optional de manera adecuada, puedes escribir código que maneje de manera elegante la posibilidad de valores nulos sin necesidad de comprobaciones explícitas de nulidad.

Promueve la programación defensiva: Optional fomenta la programación defensiva al hacer que los desarrolladores piensen en cómo manejar valores nulos de manera explícita.

Un ejemplo básico de cómo utilizar Optional es el siguiente:

        Optional<String> nombre = Optional.of("John Doe");
        System.out.println(nombre.get());

En este ejemplo, creamos un Optional que contiene el valor "John Doe" utilizando el método estático of(). Luego, utilizamos el método get() para obtener el valor del Optional. Si el Optional está presente, get() devolverá el valor, de lo contrario, lanzará una excepción NoSuchElementException.

        Optional<String> optionalNombre = Optional.ofNullable(obtenerNombre()); // Obtener un Optional con un valor posiblemente nulo
        String nombre = optionalNombre.orElse("Nombre Predeterminado"); // Obtener el valor o un valor predeterminado si está ausente

En este ejemplo, optionalNombre contiene un valor opcional que puede ser nulo. Usamos orElse para obtener el valor contenido en el Optional o un valor predeterminado si está ausente.

**4.2.2. Evitando excepciones NullPointerException**

Uno de los beneficios clave de Optional es evitar las excepciones NullPointerException. Cuando utilizas métodos como get() en un Optional que contiene un valor nulo, no lanzará una excepción, sino que simplemente devolverá un valor nulo o el valor predeterminado especificado.

Además, puedes utilizar métodos como ifPresent() para ejecutar código solo si el valor está presente, lo que evita la necesidad de comprobaciones explícitas de nulidad.

      Optional<String> optionalNombre = Optional.ofNullable(obtenerNombre());
      
      optionalNombre.ifPresent(nombre -> {
      System.out.println("El nombre es: " + nombre);
      });

En este ejemplo, el código dentro de ifPresent se ejecutará solo si optionalNombre contiene un valor no nulo, lo que elimina la necesidad de verificar si el valor es nulo antes de realizar una acción.

En resumen, Optional es una herramienta útil para manejar de manera más segura y declarativa los valores que pueden ser nulos en Java. Ayuda a evitar excepciones NullPointerException y promueve una programación más robusta y defensiva.

**4.3. Composición de funciones**

La composición de funciones es una técnica en programación funcional que te permite combinar dos o más funciones para crear una nueva función. En Java 8, puedes realizar la composición de funciones utilizando los métodos compose y andThen proporcionados por la interfaz funcional Function<T, R>.

**4.3.1. compose y andThen**

**compose:** El método compose se utiliza para componer dos funciones, donde la primera función se ejecuta y luego la segunda función se aplica al resultado de la primera. En otras palabras, si tienes dos funciones f y g, f.compose(g) ejecutará primero g y luego f en el resultado de g.

**andThen:** El método andThen es similar a compose, pero realiza las operaciones en el orden inverso. Es decir, si tienes dos funciones f y g, f.andThen(g) ejecutará primero f y luego g en el resultado de f.

Estos métodos permiten construir flujos de transformación de datos de manera más elegante y legible, ya que puedes encadenar funciones y aplicar transformaciones secuenciales.

Ejemplo de compose y andThen:

Supongamos que tienes dos funciones f y g que realizan operaciones en números enteros:

      Function<Integer, Integer> f = x -> x * 2;
      Function<Integer, Integer> g = x -> x + 3;

Puedes componer estas funciones de la siguiente manera:

Usando compose para ejecutar primero g y luego f:

      Function<Integer, Integer> compuesta = f.compose(g);
      int resultado1 = compuesta.apply(5); // Aplicará primero g y luego f: f(g(5)) = f(5+3) = f(8) = 8*2 = 16

Usando andThen para ejecutar primero f y luego g:

      Function<Integer, Integer> compuesta2 = f.andThen(g);
      int resultado2 = compuesta2.apply(5); // Aplicará primero f y luego g: g(f(5)) = g(5*2) = g(10) = 10+3 = 13

En ambos casos, obtienes un nuevo Function que realiza la composición de las funciones f y g, aplicando las transformaciones en el orden especificado.

La composición de funciones es una técnica poderosa para construir flujos de transformación de datos y modularizar el código de manera más eficiente y legible en programación funcional.

## Módulo 5: Programación Funcional en Práctica
**5.1. Patrones comunes en programación funcional**
**5.1.1. Recursión**

La recursión es un patrón de programación en el que una función se llama a sí misma para resolver un problema más grande o complejo dividiéndolo en subproblemas más pequeños y manejables. La recursión es una característica esencial en la programación funcional y se utiliza en lugar de bucles iterativos en muchos casos.

Los conceptos clave de la recursión incluyen:

**Caso base:** Es el punto de terminación de la recursión. Cuando se alcanza el caso base, la función recursiva deja de llamarse a sí misma y comienza a volver atrás para resolver los problemas más grandes.

**Caso recursivo:** Es la parte de la función que se llama a sí misma con argumentos modificados. Esto permite resolver el problema original dividiéndolo en subproblemas más pequeños.

Un ejemplo de una función recursiva en programación funcional que calcula el factorial de un número en Java 8:

      import java.util.function.Function;

      public class EjemploRecursion {
      public static void main(String[] args) {
      // Definimos una función recursiva para calcular el factorial
      Function<Integer, Integer> factorial = n -> {
      // Caso base: si n es 0 o 1, el factorial es 1
      if (n == 0 || n == 1) {
      return 1;
      }
      // Caso recursivo: calculamos el factorial de n-1 y lo multiplicamos por n
      else {
      return n * factorial.apply(n - 1);
      }
      };

      // Calculamos el factorial de 5
      int resultado = factorial.apply(5);
      System.out.println("El factorial de 5 es: " + resultado);
      }
    }

En este ejemplo, definimos una función factorial que toma un número n como argumento. Dentro de la función, tenemos dos casos:

Caso base: Si n es igual a 0 o 1, el resultado del factorial es 1, por lo que simplemente retornamos 1.

Caso recursivo: Si n es mayor que 1, calculamos el factorial de n-1 llamando a la función factorial de manera recursiva y luego multiplicamos el resultado por n.

Finalmente, calculamos el factorial de 5 llamando a factorial.apply(5) y mostramos el resultado en la consola. La recursión se utiliza aquí para dividir el problema del cálculo del factorial en subproblemas más pequeños hasta llegar al caso base. Este es un ejemplo típico de cómo se implementa la recursión en programación funcional.

**5.1.2. Map-Reduce**

Map-Reduce es un patrón de programación funcional que se utiliza para procesar y analizar grandes conjuntos de datos distribuidos de manera eficiente. Este patrón se ha vuelto especialmente popular en el contexto de la programación en paralelo y en la construcción de sistemas de procesamiento de datos distribuidos, como Hadoop y Apache Spark.

El patrón Map-Reduce se divide en dos fases principales: la fase de Map y la fase de Reduce.

Fase de Map (Mapeo): En esta fase, se aplica una función llamada función de mapeo (map function) a cada elemento del conjunto de datos original. La función de mapeo toma un elemento de entrada y produce una serie de pares clave-valor (key-value). Estos pares representan la información relevante que se extrae o se procesa del elemento de entrada. La función de mapeo se aplica de manera paralela a múltiples elementos del conjunto de datos original.

Fase de Reduce (Reducción): En esta fase, se aplica una función de reducción (reduce function) a los pares clave-valor generados en la fase de Map. La función de reducción agrupa los pares clave-valor por clave y luego realiza una operación de resumen o agregación en cada grupo de pares con la misma clave. El resultado final es un conjunto de resultados resumidos o agregados.

El patrón Map-Reduce es especialmente útil para procesar datos de manera distribuida en clústeres de servidores. Permite el procesamiento paralelo de grandes volúmenes de datos, lo que lo hace adecuado para tareas como el procesamiento de registros de registros, análisis de datos masivos y generación de informes.

Ejemplo simplificado de Map-Reduce en Java 8:

Supongamos que tenemos una lista de números y queremos calcular la suma de todos los números pares utilizando el patrón Map-Reduce.

      import java.util.Arrays;
      import java.util.List;
      
      public class MapReduceExample {
      public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Fase de Map: Mapeo para filtrar números pares y asignarles valor 1
        long sumaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToLong(numero -> 1)
                .sum();

        // Fase de Reduce: Sumar los valores 1 para obtener la suma total de pares
        System.out.println("La suma de los números pares es: " + sumaPares);
        }
      }

En este ejemplo simplificado, la fase de Map filtra los números pares y asigna el valor 1 a cada uno. Luego, en la fase de Reduce, sumamos todos los valores 1 para obtener la suma total de números pares. Aunque este ejemplo es simple, ilustra el concepto básico de Map-Reduce en programación funcional.


**5.2. Manejo de excepciones en programación funcional**

En Java, el manejo de excepciones se puede abordar de manera funcional utilizando clases como Optional o Either de bibliotecas externas. Aunque Java no proporciona una estructura de datos Either de forma nativa, puedes implementar un enfoque similar utilizando Optional y manejar errores mediante valores Optional.empty().

Aquí tienes un ejemplo de cómo manejar excepciones de manera funcional en Java utilizando Optional:

      import java.util.Optional;

      public class ManejoDeExcepcionesFuncional {
      public static void main(String[] args) {
      Optional<Integer> resultado = dividir(10, 2);

        resultado.ifPresent(valor -> {
            System.out.println("Resultado: " + valor);
        });

        Optional<Integer> error = dividir(10, 0);
        
        error.ifPresentOrElse(
            valor -> {
                System.out.println("Resultado: " + valor);
            },
            () -> {
                System.out.println("Error: División por cero");
            }
        );
    }

    public static Optional<Integer> dividir(int a, int b) {
        try {
            int resultado = a / b;
            return Optional.of(resultado);
        } catch (ArithmeticException ex) {
            return Optional.empty();
        }
    }
      }

En este ejemplo, la función dividir utiliza un bloque try-catch para manejar una posible excepción de división por cero. Si no se produce una excepción, devuelve un Optional con el resultado, de lo contrario, devuelve un Optional.empty() para indicar un error.

Luego, en el main, utilizamos métodos de Optional como ifPresent y ifPresentOrElse para manejar el resultado o el error de manera funcional.

Si deseas un enfoque más completo con manejo de errores a través de una estructura de datos Either, deberás utilizar bibliotecas externas como Vavr o JavaSlang, que proporcionan implementaciones de Either y otras estructuras de datos funcionales en Java. Estas bibliotecas permiten un manejo de errores más expresivo y funcional.


## Módulo 6: Biblioteca de Streams Avanzada
**6.1. Streams paralelos**

En Java, los streams paralelos son una característica que te permite aprovechar el poder del procesamiento en paralelo para realizar operaciones en colecciones de manera más eficiente cuando tienes múltiples núcleos de CPU disponibles. Esto es especialmente útil para procesar grandes conjuntos de datos donde se pueden realizar operaciones en paralelo en múltiples elementos al mismo tiempo.

**6.1.1. Paralelismo en streams**
**6.1.2. Uso de parallelStream()**

Los streams paralelos en Java 8 y posteriores permiten realizar operaciones en paralelo de manera sencilla. Para convertir un stream en un stream paralelo, simplemente puedes llamar al método parallel() en el stream. A continuación, se muestra un ejemplo:

      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      // Convertir el stream en un stream paralelo
      Stream<Integer> streamParalelo = numeros.parallelStream();
      
      // Realizar una operación en paralelo, por ejemplo, multiplicar cada número por 2
      List<Integer> resultado = streamParalelo.map(numero -> numero * 2)
      .collect(Collectors.toList());

En este ejemplo, numeros.parallelStream() crea un stream paralelo a partir de una lista de números. Luego, la operación map se ejecuta en paralelo en los elementos del stream, multiplicando cada número por 2. Finalmente, los resultados se recopilan en una lista.

Es importante tener en cuenta que no todas las operaciones son apropiadas para streams paralelos, ya que no todos los algoritmos se benefician del paralelismo. Debes ser consciente de la concurrencia y la posible necesidad de sincronización cuando trabajas con streams paralelos.

Algunos puntos clave sobre los streams paralelos:

El paralelismo solo es efectivo cuando se trabaja con conjuntos de datos lo suficientemente grandes o cuando las operaciones son lo suficientemente costosas en términos de tiempo de CPU.

Los streams paralelos se pueden usar para acelerar operaciones como filtrado, mapeo y reducción en colecciones grandes.

Debes tener en cuenta la posible necesidad de sincronización al trabajar con datos compartidos en operaciones paralelas.

Java ofrece una serie de operaciones de terminal que son seguras para su uso en streams paralelos, como forEachOrdered, collect, reduce, min, max, entre otros.

En resumen, los streams paralelos en Java son una característica poderosa para el procesamiento eficiente de grandes conjuntos de datos mediante la explotación del paralelismo de hardware. Sin embargo, debes usarlos con precaución y asegurarte de que son apropiados para tu caso de uso particular.

**6.2. Collectors personalizados**

En Java, los collectores son una parte importante de la API Stream y se utilizan para acumular los elementos de un stream en una colección o un valor. Aunque Java proporciona muchos collectors predefinidos, a veces es necesario crear collectors personalizados para satisfacer necesidades específicas de procesamiento y agregación de datos.

**6.2.1. Creación de collectors personalizados**

Puedes crear tus propios collectors personalizados en Java extendiendo la clase java.util.stream.Collector y proporcionando implementaciones personalizadas para los cinco métodos abstractos que se deben implementar:

Supplier<R> supplier(): Este método debe devolver una función que inicializa y proporciona un contenedor mutable para recopilar los elementos del stream.

BiConsumer<R, T> accumulator(): Esta función toma un acumulador (R) y un elemento del stream (T) y actualiza el acumulador con el elemento. Debe realizar la lógica de acumulación personalizada.

BinaryOperator<R> combiner(): Si deseas realizar operaciones de combinación en paralelo, este método debe proporcionar una función que combine dos acumuladores parciales en uno. Es importante tener en cuenta que esta función debe ser segura para la concurrencia.

Function<R, R> finisher(): Esta función toma un acumulador (R) y devuelve el resultado final del proceso de recolección.

Set<Characteristics> characteristics(): Devuelve un conjunto de características que describe el collector, como si es CONCURRENT, UNORDERED, IDENTITY_FINISH, etc.

Aquí tienes un ejemplo simplificado de cómo crear un collector personalizado que acumula elementos en una lista y realiza una operación personalizada en el acumulador:

      import java.util.*;
      import java.util.stream.Collector;
      import java.util.stream.Collectors;
      
      public class MiCollector<T> implements Collector<T, List<T>, List<T>> {

          @Override
          public Supplier<List<T>> supplier() {
              return ArrayList::new; // Inicializa una lista vacía
          }
      
          @Override
          public BiConsumer<List<T>, T> accumulator() {
              return (lista, elemento) -> {
                  // Realiza una operación personalizada en el acumulador
                  if (elemento != null) {
                      lista.add(elemento);
                  }
              };
          }
      
          @Override
          public BinaryOperator<List<T>> combiner() {
              return (lista1, lista2) -> {
                  lista1.addAll(lista2); // Combina dos acumuladores parciales
                  return lista1;
              };
          }
      
          @Override
          public Function<List<T>, List<T>> finisher() {
              return Function.identity(); // Devuelve el acumulador tal como está
          }
      
          @Override
          public Set<Characteristics> characteristics() {
              return Collections.emptySet(); // No se aplican características especiales
          }
      
          public static void main(String[] args) {
              List<String> palabras = Arrays.asList("Hola", "mundo", "este", "es", "un", "collector", "personalizado");
      
              List<String> resultado = palabras.stream()
                      .collect(new MiCollector<>()); // Usar el collector personalizado
      
              System.out.println(resultado);
          }
      }

En este ejemplo, el collector personalizado MiCollector acumula elementos en una lista y realiza una operación personalizada que excluye elementos nulos. Ten en cuenta que este es un ejemplo simplificado; los collectors personalizados pueden ser mucho más complejos según tus necesidades específicas.

**6.2.2. toMap, toSet, y otros collectors predefinidos**

En Java, la API Stream proporciona varios collectors predefinidos que facilitan la acumulación de elementos en diferentes tipos de colecciones, como mapas (toMap), conjuntos (toSet), listas (toList), y otros tipos de contenedores. Estos collectors son útiles en situaciones comunes de procesamiento de datos. A continuación, se presentan algunos de los collectors predefinidos más utilizados:

1. toMap

El collector toMap se utiliza para acumular elementos en un mapa. Puedes especificar cómo se mapean las claves y los valores en función de los elementos del stream. Aquí tienes un ejemplo:

      import java.util.*;
      import java.util.stream.Collectors;
      
      public class EjemploToMap {
      public static void main(String[] args) {
            List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Ana");
      
              Map<String, Integer> longitudNombres = nombres.stream()
                      .collect(Collectors.toMap(
                              nombre -> nombre,         // Función de clave (nombre)
                              nombre -> nombre.length() // Función de valor (longitud del nombre)
                      ));
      
              System.out.println(longitudNombres);
           }
      }

En este ejemplo, los nombres se acumulan en un mapa donde las claves son los nombres y los valores son las longitudes de los nombres.

2. toSet

El collector toSet se utiliza para acumular elementos en un conjunto (Set). Esto garantiza que los elementos en la colección resultante sean únicos. Aquí tienes un ejemplo:

      import java.util.*;
      import java.util.stream.Collectors;
      
      public class EjemploToSet {
      public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
      
              Set<Integer> conjuntoNumeros = numeros.stream()
                      .collect(Collectors.toSet());
      
              System.out.println(conjuntoNumeros);
          }
      }

En este ejemplo, los números se acumulan en un conjunto, lo que elimina los duplicados y produce un conjunto de números únicos.

3. toList

El collector toList se utiliza para acumular elementos en una lista. Esto es útil cuando deseas mantener el orden original de los elementos. Aquí tienes un ejemplo:

      import java.util.*;
      import java.util.stream.Collectors;
      
      public class EjemploToList {
      public static void main(String[] args) {
      Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
      
              List<Integer> listaNumeros = stream.collect(Collectors.toList());
      
              System.out.println(listaNumeros);
          }
      }

En este ejemplo, los números se acumulan en una lista en el mismo orden en el que aparecen en el stream.

Estos son solo algunos ejemplos de los collectors predefinidos disponibles en Java para acumular elementos en diferentes tipos de colecciones. La API Stream proporciona una variedad de collectors útiles que puedes utilizar según tus necesidades específicas de procesamiento de datos.


## Módulo 7: Diseño Funcional y Pruebas Unitarias
**7.1. Diseño de software funcional**

El diseño de software funcional es un enfoque de diseño de software que se basa en los principios de la programación funcional. En lugar de centrarse en los estados mutables y los efectos secundarios, el diseño funcional se centra en la inmutabilidad, la pureza de las funciones y la composición de funciones para construir sistemas robustos y fáciles de mantener.

**7.1.1. Principios SOLID en programación funcional**

Los principios SOLID son un conjunto de cinco principios de diseño de software que se utilizan en la programación orientada a objetos para crear código más mantenible y extensible. Si bien estos principios se originaron en el contexto de la programación orientada a objetos, algunos de ellos todavía pueden aplicarse en la programación funcional. A continuación, se describen brevemente los principios SOLID y cómo pueden relacionarse con la programación funcional:

Principio de Responsabilidad Única (Single Responsibility Principle - SRP): Este principio establece que una clase debe tener una única razón para cambiar. En la programación funcional, la aplicación de este principio significa que una función o módulo debe hacer una sola cosa y hacerla bien. Las funciones puras y la composición de funciones en la programación funcional pueden ayudar a mantener la responsabilidad única.

Principio de Abierto/Cerrado (Open/Closed Principle - OCP): Este principio sugiere que las entidades de software (como clases o módulos) deben estar abiertas para extensión pero cerradas para modificación. En la programación funcional, esto puede lograrse mediante la creación de funciones y módulos que sean fáciles de extender mediante la composición en lugar de la modificación directa.

Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP): Este principio se refiere a la capacidad de sustituir una clase derivada por su clase base sin afectar la corrección del programa. En la programación funcional, se enfatiza la inmutabilidad y la consistencia de tipos, lo que puede contribuir a la aplicación de este principio.

Principio de Segregación de Interfaces (Interface Segregation Principle - ISP): Este principio sugiere que las interfaces no deben imponer a las clases que las implementan a que proporcionen métodos que no utilizan. En la programación funcional, la interfaz de una función o módulo debería ser simple y proporcionar solo lo que es necesario, lo que puede relacionarse con este principio.

Principio de Inversión de Dependencia (Dependency Inversion Principle - DIP): Este principio establece que los módulos de alto nivel no deben depender de los módulos de bajo nivel, sino de abstracciones. En la programación funcional, la dependencia en abstracciones (por ejemplo, funciones de orden superior) en lugar de implementaciones concretas puede promover una inversión de dependencia adecuada.

Si bien los principios SOLID están estrechamente relacionados con la programación orientada a objetos, algunos de ellos siguen siendo relevantes en la programación funcional debido a su enfoque en la modularidad, la inmutabilidad y la responsabilidad única. Sin embargo, la programación funcional también introduce sus propios principios y enfoques de diseño, como la inmutabilidad y la pureza de las funciones, que complementan estos principios. La aplicación de estos principios depende en gran medida del lenguaje y del paradigma de programación que estés utilizando.

**7.1.2. Inyección de dependencias**

La inyección de dependencias es un patrón de diseño que se utiliza para administrar las dependencias y las relaciones entre componentes en una aplicación de software. Aunque es más comúnmente asociado con la programación orientada a objetos y los contenedores de inversión de control (IoC), el concepto de inyección de dependencias también es aplicable en el contexto de la programación funcional.

En el contexto de la programación funcional, la inyección de dependencias se refiere a la práctica de proporcionar las dependencias necesarias (como funciones u objetos inmutables) a una función o módulo en lugar de que estos componentes los creen o los obtengan internamente. Esto promueve un diseño más modular, desacoplado y testeable en el código funcional.

Aquí hay algunas formas en que se puede aplicar la inyección de dependencias en programación funcional:

Pasando funciones como argumentos: En la programación funcional, puedes pasar funciones como argumentos a otras funciones. Esto permite que una función dependa de otras funciones para realizar operaciones específicas. Es una forma de inyección de dependencias funcional. Por ejemplo:

      // Función de orden superior que toma una función como argumento
      public static int aplicarOperacion(int numero, Function<Integer, Integer> operacion) {
      return operacion.apply(numero);
      }
      
      // Uso de la función de orden superior con una operación específica
      int resultado = aplicarOperacion(5, x -> x * 2); // Inyección de dependencia de la función de multiplicación

Usando contenedores de dependencias funcionales: Algunos lenguajes funcionales y bibliotecas proporcionan contenedores de dependencias funcionales que permiten definir y gestionar las dependencias de las funciones de manera declarativa. Estos contenedores pueden facilitar la configuración y la resolución de dependencias en aplicaciones funcionales.

Inmutabilidad de datos: En la programación funcional, los datos son inmutables, lo que significa que no pueden cambiar después de su creación. Esto promueve la creación de objetos de datos inmutables que pueden pasarse de manera segura como dependencias a las funciones sin preocuparse por efectos secundarios no deseados.

La inyección de dependencias en programación funcional es beneficiosa porque:

Facilita la prueba unitaria: Al proporcionar dependencias como argumentos, es más fácil crear pruebas unitarias y probar el comportamiento de las funciones de manera aislada.

Promueve la modularidad: Las funciones pueden ser independientes y reutilizables, lo que facilita su composición en sistemas más grandes.

Facilita el intercambio de implementaciones: Puedes cambiar las implementaciones de las dependencias sin cambiar el código que las utiliza, lo que hace que el código sea más flexible y mantenible.

En resumen, la inyección de dependencias es una práctica relevante en la programación funcional que implica proporcionar dependencias externas a las funciones o módulos en lugar de crearlas internamente. Esto fomenta un diseño más modular y desacoplado, lo que facilita las pruebas y la mantenibilidad del código funcional.


**7.2. Pruebas unitarias en programación funcional**
**7.2.1. JUnit y pruebas unitarias**

JUnit: JUnit es un popular framework de pruebas unitarias para Java (y otros lenguajes) que permite a los desarrolladores escribir y ejecutar pruebas automatizadas en sus aplicaciones Java. Es una herramienta esencial para el desarrollo de software de calidad y la verificación de que las partes individuales de un programa funcionen según lo previsto.

Pruebas Unitarias: Las pruebas unitarias son una técnica de desarrollo de software en la que se prueban unidades de código individuales, como funciones o métodos, para asegurarse de que funcionen correctamente. El objetivo es identificar y corregir errores en unidades específicas del código antes de que se integren en el sistema en su conjunto. Esto mejora la calidad del software y facilita el mantenimiento y la depuración.

En el contexto de la programación funcional, las pruebas unitarias son igualmente importantes. Puedes aplicar las mismas técnicas de pruebas unitarias a tus funciones y expresiones lambda como lo harías con otros métodos y funciones en Java. Aquí hay un ejemplo de cómo se vería una prueba unitaria en JUnit para una función lambda:

      import static org.junit.jupiter.api.Assertions.assertEquals;
      import org.junit.jupiter.api.Test;
      import java.util.function.Function;
      
      public class PruebaFuncionLambda {

          @Test
          public void testFuncionLambda() {
              // Define la función lambda a probar
              Function<Integer, Integer> funcion = x -> x * 2;
      
              // Prueba la función con un valor de entrada
              int resultado = funcion.apply(5);
      
              // Comprueba si el resultado es el esperado
              assertEquals(10, resultado);
          }
      }

En este ejemplo, hemos definido una prueba unitaria utilizando JUnit para una función lambda que multiplica un número por 2. La anotación @Test indica que este método es una prueba. Dentro de la prueba, definimos la función lambda, aplicamos un valor de entrada y luego comparamos el resultado con el valor esperado utilizando assertEquals de JUnit.

Las pruebas unitarias en programación funcional son especialmente útiles para asegurarse de que las funciones y expresiones lambda se comporten de la manera esperada y cumplan con sus especificaciones. También pueden ayudar a identificar problemas en el código antes de que se propaguen a otras partes de la aplicación.

**7.2.2. Pruebas de funciones puras**

Las "pruebas de funciones puras" se refieren a las pruebas unitarias específicas diseñadas para validar el comportamiento de funciones que siguen el principio de "funciones puras" en el contexto de la programación funcional. Las funciones puras son funciones que, dado el mismo conjunto de entradas, siempre producirán el mismo resultado y no tienen efectos secundarios. Estas funciones son predecibles y no dependen de ningún estado mutable externo.

Cuando se realizan pruebas de funciones puras, el objetivo principal es verificar si la función produce el resultado correcto para un conjunto dado de entradas y si no tiene efectos secundarios indeseados. Aquí hay algunas pautas y conceptos clave relacionados con las pruebas de funciones puras:

Determinismo: Las pruebas de funciones puras se basan en la propiedad del determinismo de las funciones puras. Dado un conjunto particular de entradas, la función pura siempre producirá el mismo resultado. Por lo tanto, puedes escribir pruebas que verifiquen si la función produce el resultado esperado para diferentes conjuntos de entradas.

Independencia de estado: Las funciones puras no dependen de ningún estado mutable externo o datos globales. Esto significa que no debes preocuparte por el estado compartido o la mutabilidad al escribir pruebas para funciones puras. Las pruebas deben enfocarse únicamente en las entradas y salidas de la función.

Efectos secundarios: Parte de la prueba de una función pura implica asegurarse de que la función no tenga efectos secundarios. No debe modificar variables globales, archivos o realizar acciones que no sean directamente relevantes para la computación de su resultado.

Propiedades matemáticas: Las funciones puras suelen tener propiedades matemáticas bien definidas. Puedes utilizar estas propiedades para diseñar pruebas que verifiquen si la función se comporta de acuerdo con esas propiedades.

Mocking y stubbing: En algunas situaciones, es posible que necesites simular el comportamiento de funciones o componentes externos que interactúan con la función pura. Esto se hace utilizando técnicas de mocking y stubbing para aislar la función bajo prueba.

Pruebas parametrizadas: Las pruebas parametrizadas son útiles para probar una función pura con diferentes conjuntos de datos de entrada. Puedes definir múltiples casos de prueba y ejecutarlos en una sola prueba parametrizada para verificar la funcionalidad de la función pura.

Pruebas de borde: Asegúrate de incluir casos de prueba que representen situaciones límite o bordes. Estos casos pueden ayudarte a descubrir problemas de esquina en la implementación de la función pura.

En resumen, las pruebas de funciones puras son una parte esencial del desarrollo en programación funcional. Ayudan a garantizar la confiabilidad y previsibilidad de las funciones puras al verificar que producen resultados correctos y no tienen efectos secundarios no deseados. Estas pruebas son fundamentales para la construcción de sistemas robustos y mantenibles en un estilo de programación funcional.

un ejemplo sencillo de una función pura y cómo podrías realizar pruebas unitarias para ella utilizando JUnit:

Supongamos que tenemos una función pura llamada duplicar que toma un número entero y devuelve el doble de ese número. La función es pura porque dado el mismo número de entrada, siempre produce el mismo resultado y no tiene efectos secundarios.

      import org.junit.jupiter.api.Test;
      import static org.junit.jupiter.api.Assertions.assertEquals;
      
      public class PruebaFuncionPura {
      
          // La función pura a probar
          public int duplicar(int numero) {
              return numero * 2;
          }
      
          @Test
          public void testDuplicar() {
              // Creamos una instancia de la clase que contiene la función
              PruebaFuncionPura instancia = new PruebaFuncionPura();
      
              // Probamos la función con diferentes entradas
              int resultado1 = instancia.duplicar(5);
              int resultado2 = instancia.duplicar(-3);
              int resultado3 = instancia.duplicar(0);
      
              // Comparamos los resultados con los valores esperados
              assertEquals(10, resultado1);
              assertEquals(-6, resultado2);
              assertEquals(0, resultado3);
          }
      }

En este ejemplo, hemos definido una función duplicar que es pura porque no depende de ningún estado externo y siempre produce el doble del número de entrada. Luego, hemos escrito una prueba unitaria utilizando JUnit para verificar que la función duplicar produce los resultados esperados para diferentes entradas.

La anotación @Test marca el método testDuplicar como una prueba unitaria. En esta prueba, creamos una instancia de la clase que contiene la función duplicar y luego llamamos a la función con diferentes valores de entrada. Utilizamos assertEquals para comparar los resultados con los valores esperados y verificar que la función se comporte correctamente.

Este es un ejemplo muy básico, pero ilustra cómo puedes escribir pruebas unitarias para funciones puras en Java utilizando JUnit. En la práctica, las pruebas de funciones puras pueden involucrar casos de prueba más complejos y propiedades matemáticas específicas que deban cumplirse.