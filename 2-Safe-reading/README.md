# Ejercicio 1 — Lectura segura desde el teclado

**Descripció**: Objetivos:

- Aprender a capturar y gestionar excepciones a la hora de introducir datos por teclado.
- Evitar que la aplicación se cierre por errores de entrada del usuario/a.
- Práctica con excepciones estándar ( InputMismatchException) y personalizadas.
- Consolidar el uso de métodos estáticos para facilitar la reutilización del código.

## 📌 Enunciat del exercici
Crea una clase utilitaria llamada ConsoleReaderque permita leer distintos tipos de datos desde el teclado de forma segura. Esta clase debe gestionar los errores que pueden aparecer cuando el usuario introduce valores incorrectos, como por ejemplo texto en vez de números.

Para ello, crea un único objeto Scannery define una serie de métodos estáticos para leer datos. Estos métodos deben mostrar un mensaje personalizado, leer el valor y validarlo. Si la entrada es incorrecta, se mostrará un mensaje de error (por ejemplo: “Error de formato” ) y se volverá a pedir el dato hasta que sea válido.

## ✨ Funcionalitats
- Scanner
- Excepciones

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **Gestor de projecte**: Maven
- **IDE**: IntelliJ IDEA

## Excecution
- He creado una clase ConsoleReader donde he importade el Scanner
- He crado una clase Main de donde llamarè los metodos del ConsoleReader sin necesidad de importar Scanner
- He creado un primer metodo readByte, llamandolo del Main, si el utente no escribe un byte el programa termina con un error.
- He puesto un try-catch en el metodo, aunque me salia el mensaje de la excepcion me saltava error y se parava la applicacion. 
- Asi he puesto un while (true) al principio del metodo para crear un bucle infinito hasta que el valor sea exacto. 
- El metodo entraba en bucle y he puesto un scanner.nextLine() en el catch para limpiar el buffer.
- He usado la misma estructura para los metodos readInt(), readFloat() y readDouble().
- Para el metodo readChar() he creado una Excepcion InvalidCharLength y la he puesto en el metodo con un if (controlando que la palabra solo tenga una letra) y igualmente en un try-catch.