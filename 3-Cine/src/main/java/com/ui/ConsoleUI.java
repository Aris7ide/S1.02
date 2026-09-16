package com.ui;

import com.service.ReservationService;
import com.util.ConsoleReader;

public class ConsoleUI {

    ReservationService service;

    public ConsoleUI(ReservationService service) {
        this.service = service;
    }

    public void start() {
        //Menu?
        int option = 1;
        while (option != 0) {
            System.out.println("ELIGE UNA OPCIÒN:\n" +
                    "1. Mostrar todos los asientos reservados.\n" +
                    "2. Mostrar todos los asientos reservados por una sola persona.\n" +
                    "3. Reservar asientos.\n" +
                    "4. Cancelar una reserva.\n" +
                    "5. Cancelar todas las reservas de una persona\n" +
                    "0. Salir.");

            option = ConsoleReader.readInt("Entre 0 y 5");

            switch (option) {
                case 1:
                    ReservationService.showsAllSeats();
                    break;
                case 2:
                    ReservationService.showsAllSeatsByName();
                    break;
                case 3:
                    ReservationService.reserveSeat(service);
                    break;
                case 4:
                    ReservationService.cancelSeat(service);
                    break;
                case 5:
                    ReservationService.cancelSeatByName(service);
                    break;
                case 0:
                    System.out.println("Hasta pronto.");
                    option = 0;
            }
        }
    }
}
