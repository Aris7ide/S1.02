# Nivell 3 Exercici 1 — Reserves en el cinema

## 📌 Enunciat del exercici

Una empresa de cinemes et demana que desenvolupis una aplicació per gestionar la reserva de seients a les seves sales. Aquesta aplicació serà utilitzada pels venedors/es a l’hora de vendre entrades.
Quan l’aplicació s’executa, primer demanarà quantes files i quants seients per fila té la sala. Un cop inicialitzada, es mostrarà el següent menú:

        1.- Mostrar totes les butaques reservades.
        2.- Mostrar les butaques reservades per una persona.
        3.- Reservar una butaca.
        4.- Anul·lar la reserva d’una butaca.
        5.- Anul·lar totes les reserves d’una persona.
        0.- Sortir.

## ✨ Funcionalitats
- ArrayList
- Override de equalsTo() y toString()
- Excepciones personalizadas
- Estructura en clases y carpetas organizada
- Distincion entre Main, ConsoleUI y Service
- Entrada de datos

## 🛠 Tecnologies
- **Llenguatge**: Java 25
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
- #### He creado el metodo reserveSeat()
- He llamado el metodo ReservatioService.readString() y añadido la excepcion personalizada para estar seguro que el nombre no estè vacio o con numeros.
- He añadido al reserveSeat() el Reservation.readInt() creando dos try-catch, uno para la fila y uno para el asiento.
- El de la fila entra en un try-catch con una unica excepcion InvalidSeatException, para evitar que se ponga una fila que no existe. 
- El del asiento entra en un try-catch con dos excepciones (InvalidSeat y SeatAlreadyTaken).
- #### Importante notar que he tenido que meter un break; en los while(true) para salir de uno y poder entrar en otro.
- He completado el reserveSeat() creando un Seat y guardándolo en el Array listSeats.
- He intentado enseñar las reservas hechas con showsAllSeats() y showsAllSeatsByName() y todo sale correcto.
- #### He creado el cancelSeat() 
- Ya que tenia que pedir otra vez seat y row he creado dos metodos getSeat y getRow paara facilitar
- en el metodo cancelSeat() he llamado los getSeat y getRow
- despues de verificar que el Seat existe he cancelado al reserva con un .remove
- #### He creado el metodo cancelSeatByName() en ReservationService.
- Tiene la misma estructura del showsAllSeatsByName() per la diferencia es que una vez encontrados se cancelan con un .removeIf().