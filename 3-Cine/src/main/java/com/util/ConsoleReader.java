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
                return scanner.nextLine();
            } catch (InvalidPersonNameException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
