package com.main;

import com.service.ReservationService;
import com.ui.ConsoleUI;
import com.util.ConsoleReader;

public class Main {
    static void main(String[] args) {

        System.out.println("CONFIGURE YOUR CINEMA");

        int rowsTotal = ConsoleReader.readInt("How many rows does the room have?");
        int seatsTotal = ConsoleReader.readInt("Hoe many seats does any row have?");

        ReservationService service = new ReservationService(rowsTotal, seatsTotal);
        ConsoleUI ui = new ConsoleUI(service); //hay que crear la clase ui con un constructor que reciba service

        ui.start(); //metodo en ui no statico

    }
}
