# Ejercicio 1 – Excepciones personalizadas y control de errores

**Descripció**: Objetivos: 

- Crear una excepción personalizada y saber cómo se tira y captura.
- Trabajar con colecciones ( ArrayList<Product>) y cálculos sobre datos.
- Detectar y gestionar errores habituales como IndexOutOfBoundsException.

## 📌 Enunciat del exercici
Imagina que estás desarrollando una pequeña aplicación para manejar ventas. Cada venta puede incluir varios productos, y el sistema debe ser capaz de calcular el total. Ahora bien, no tendría sentido realizar este cálculo si aún no se ha añadido ningún producto. Por eso, implementaremos una comprobación para evitarlo.

Empieza definiendo una clase Productcon dos atributos: namey price. Esta clase representará un producto individual en la venta.

Después, crea una clase Sale, que debe contener una colección de productos (por ejemplo, una ArrayList<Product>) y una variable para almacenar el total ( totalPrice). Esta clase incluirá un método calculateTotal()que:

Compruebe si la colección está vacía.
Si está vacía, tire una excepción personalizada llamada EmptySaleException, con el mensaje: "Para hacer una venta primero debes añadir productos" .
Si hay productos, sume los precios y guarde el total en el atributo totalPrice.
La clase EmptySaleExceptiondebe ser hija de Exception, y debe incluir este mensaje en su constructor.

Además, añade una prueba para generar una excepción  IndexOutOfBoundsException, por ejemplo intentando acceder a una posición inexistente de una lista, y capturarla mostrando el mensaje de error. Ésta es una excepción habitual en Java cuando se manipulan colecciones sin hacer las comprobaciones adecuadas.

Por último, cambia la clase EmptySaleException para que extienda de una excepción en tiempo de ejecución, como RuntimeException.

¿Sabes lo que esto significa? ¿Qué diferencia existe entre una excepción verificada (checked) y una no verificada (unchecked) como RuntimeException?

## ✨ Funcionalitats
- Arraylist
- Excepcion personalizada

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **Gestor de projecte**: Maven
- **IDE**: IntelliJ IDEA

## Excecution

- He creado la clase Product y la clase Sale con el ArrayList de Sales. 
- He creado la clase excepcion EmptySaleException usando el Extends Exception.
- En el metodo calculatePrice le he metido el throws EmptySaleException con el mensaje de error
- He creado el main usando el try/catch para comprobar la excepcion, sin ventas sale el error.
- De ahi he tenido que crear otro Arraylist en el Main con todas las ventas asi para poder calcular el total de todas las ventas.
- Con un for he añadido todos los precios de las ventas para sacar un total.
- Le he añadido un try/catch con IndexOutOfBoundsException llamando a un elemento get(5) de las ventas que no existe.