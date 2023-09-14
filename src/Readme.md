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
Se refieren a funciones que cumplen con dos propiedades esenciales: son deterministas y no tienen efectos secundarios. Aquí tienes una descripción más detallada de estas propiedades:

Determinismo: Una función pura siempre produce el mismo resultado para el mismo conjunto de entradas o argumentos. No importa cuántas veces llames a la función con los mismos argumentos, el resultado será consistente y predecible.

Sin efectos secundarios: Una función pura no realiza ninguna acción que afecte al estado fuera de la función. Esto significa que no modifica variables globales, no realiza operaciones de entrada/salida (como leer o escribir archivos o interactuar con bases de datos) y no produce efectos colaterales observables. La única tarea de una función pura es calcular y devolver un resultado basado en sus entradas.

Las funciones puras tienen varias ventajas:

Son más predecibles y fáciles de razonar, ya que no dependen de un estado externo o de condiciones cambiantes.
Facilitan las pruebas unitarias, ya que puedes probar una función pura con entradas específicas sin preocuparte por efectos secundarios inesperados.
Son candidatas para la optimización y la paralelización, ya que su comportamiento es consistente y no depende de factores externos.
####  1.3.2. Inmutabilidad
####  1.3.3. Funciones de orden superior
####  1.3.4. Efectos secundarios

## Módulo 2: Expresiones Lambda en Java 8
### 2.1. Introducción a las expresiones lambda
   1. Sintaxis básica
   2. Tipos de expresiones lambda

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
