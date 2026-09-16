package com.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

}
