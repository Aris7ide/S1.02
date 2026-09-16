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
- He creado las 4 excepciones personalizadas. 
- He creado una clase Seat con atributos y he cambiato las regals equals y hashCode con un override.
- Añadido el toString a la classe Seat, con fila, asiento y nombre reserva.
- #### Importante entender el concepto de Override, esto affecta solo la clase Seat.
- Creadas las clases y organizadas en una estructura entendible.
- He empezado a escribir la estructura del Main controlado los datos escrito atràves de una nueva clase util ConsoleReader y el metodo readInt().
- He añadido en el main la creacion de un service con numero de asientos y filas.
- Y tambièn una ConsoleUI pasandole el service creado.
- ui.start() lanza el menu que he empezado a escribir en la clase ConsoleUI en el metodo start().
- en ui.start() un menu de toda la vida usando ConsoleReader para cualquier entrada de datos (readInt());
- en el switch he empezado a escribir los metodos que van en ReservationService que se encarga de la logica (ReservationService.showsAllSeats).
- he creado el metodo checkName() en ReservationService que controla que el nombre existe y devuelve un true/false.
- he creado el segundo metodo del menu en ReservationService, showsAllSeatsByName() que solo devuelve los elementos bajo el mismo nombre. 
- Este ultimo usa el checkName() para asegurarse que el nombre existe.