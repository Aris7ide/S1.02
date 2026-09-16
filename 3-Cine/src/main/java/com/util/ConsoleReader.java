package com.util;

import com.exceptions.InvalidPersonNameException;
import com.service.ReservationService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            try {
                String name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    throw new InvalidPersonNameException("El valor no es valido");
                }
                if (name.matches(".*\\d.*")) {
                    throw new InvalidPersonNameException("El nombre no puede tener numeros");
                }
                return name;
            } catch (InvalidPersonNameException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
