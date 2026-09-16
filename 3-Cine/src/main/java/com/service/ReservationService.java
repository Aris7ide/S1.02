package com.service;

import com.exceptions.InvalidPersonNameException;
import com.exceptions.InvalidSeatException;
import com.exceptions.SeatAlreadyEmptyException;
import com.exceptions.SeatAlreadyTakenException;
import com.model.Seat;
import com.util.ConsoleReader;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private int rowsTotal;
    private int seatsTotal;
    private static List<Seat> listSeats;

    public ReservationService(int rowsTotal, int seatsTotal) {
        this.rowsTotal = rowsTotal;
        this.seatsTotal = seatsTotal;
        this.listSeats = new ArrayList<>();
    }

    public static boolean checkName(String name) {
        boolean value = false;
        try {
            for (Seat seat : listSeats) {
                if (name.equals(seat.getPersonName())) {
                    value = true;
                }
            }
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    // Tiene que enseñar en pantalla todos los asientos reservados, en listSeats.
    public static void showsAllSeats() {

        if (listSeats.isEmpty()) {
            System.out.println("No hay ningun asiento reservado!");
        } else {
            for (Seat seat : listSeats) {
                System.out.println(seat.toString());
            }
        }

    }

    public static void showsAllSeatsByName() {
        if (listSeats.isEmpty()) {
            System.out.println("No hay ningun asiento reservado");
        } else {
            while (true) {
                String name = ConsoleReader.readString("Cual es el nombre de la persona?");
                if (!ReservationService.checkName(name)) {
                    System.out.println("La persona no existe.\n" +
                            "Escribe un nombre valido.");
                } else {
                    for (Seat seat : listSeats) {
                        if (seat.getPersonName().equals(name)) {
                            System.out.println(seat.toString());
                        }
                    }
                }
            }
        }

    }

    //reserveSeat recibe Seat (row, seat, name) y hace la reserva
    //comprueba que no estè reservado ya (exception SeatAlreadyTaken)
    // y que los datos sean validos (InvalidPersonNameException y InvalidSeatException)
    public void reserveSeat() {

    }
}
