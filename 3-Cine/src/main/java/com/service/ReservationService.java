package com.service;

import com.exceptions.InvalidPersonNameException;
import com.exceptions.InvalidSeatException;
import com.exceptions.SeatAlreadyEmptyException;
import com.exceptions.SeatAlreadyTakenException;
import com.model.Seat;
import com.util.ConsoleReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReservationService {

    private final int rowsTotal;
    private final int seatsTotal;
    private static List<Seat> listSeats;

    public ReservationService(int rowsTotal, int seatsTotal) {
        this.rowsTotal = rowsTotal;
        this.seatsTotal = seatsTotal;
        listSeats = new ArrayList<>();
    }

    public static boolean checkName(String name) {
        boolean value = false;
        try {
            for (Seat seat : listSeats) {
                if (name.equals(seat.getPersonName())) {
                    value = true;
                    break;
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
                            System.out.println(seat);
                        }
                    }
                    break;
                }
            }
        }

    }

    public static void reserveSeat(ReservationService service) {

        String name = ConsoleReader.readString("Cual es el nombre?");
        int row = ReservationService.getRow(service);
        int seatNumber = ReservationService.getSeat(service);

        // Meter algo que avise cuando la reserva ya existe.
        try {
            for (Seat seat : listSeats) {
                if (seat.equals(new Seat(row, seatNumber, ""))) {
                    throw new SeatAlreadyTakenException("La reserva ya existe");
                }
            }

            listSeats.add(new Seat(row, seatNumber, name));
            System.out.println("La reserva ha sido hecha.");

        } catch (SeatAlreadyTakenException e) {
            System.out.println(e.getMessage());
        }
    }

    //To cancel: pedir row and seat, buscarlo y cancelarlo.
    public static void cancelSeat(ReservationService service) {

        try {

            int row = ReservationService.getRow(service);
            int seatNumber = ReservationService.getSeat(service);

            Seat dummySeat = new Seat(row, seatNumber, "");

                if (!listSeats.contains(dummySeat)) {
                    throw new SeatAlreadyEmptyException("La reserva no existe");
                }

            listSeats.remove(dummySeat);
                System.out.println("La reserva ha sido cancelada con exito");

        } catch (SeatAlreadyEmptyException e) {
                System.out.println(e.getMessage());
        }

    }

    public static void cancelSeatByName(ReservationService service) {

        if (listSeats.isEmpty()) {
            System.out.println("No hay ningun asiento reservado");
        } else {
            while (true) {
                String name = ConsoleReader.readString("Cual es el nombre de la persona?");
                if (!ReservationService.checkName(name)) {
                    System.out.println("La persona no existe.\n" +
                            "Escribe un nombre valido.");
                } else {
                    listSeats.removeIf(seat -> seat.getPersonName().equalsIgnoreCase(name));
                    System.out.println("Todas las reservas con ese nombre han sido canceladas");
                    break;
                }
            }
        }
    }

    public static int getRow(ReservationService service) {
        int row;
        while (true) {
            try {
                row = ConsoleReader.readInt("Que fila");
                if (row < 1 || row > service.rowsTotal) {
                    throw new InvalidSeatException("La fila no existe");
                }
                break;
            } catch (InvalidSeatException e) {
                System.out.println(e.getMessage());
            }
        }
        return row;
    }

    public static int getSeat(ReservationService service) {
        int seatNumber;
        while (true) {
            try {
                seatNumber = ConsoleReader.readInt("Que asiento?");
                if (seatNumber < 1 || seatNumber > service.seatsTotal) {
                    throw new InvalidSeatException("El asiento no existe");
                }
                break;
            } catch (InvalidSeatException | SeatAlreadyTakenException e) {
                System.out.println(e.getMessage());
            }
        }
        return seatNumber;
    }
}

