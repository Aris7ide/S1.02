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
- En la clase Console Reader he usado un bucle for (while) con un try and catch para pedir al usuario un byte en forma de string, pasarlo a byte y averiguar que se trata de un byte.
- Me he dado cuenta que el exception que tenia que usar era InputMismatchException, y no NumberFormatException como sugerido por el AI, 
- Esto crea un problema de buffer, no hace falta hacer ningun parsing pero si hace falta limpiar el buffer cada vez. Cambiada la excepcion en todos los metodos hasta ahora.
- 