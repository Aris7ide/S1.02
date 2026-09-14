package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    private ConsoleReader() {}

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static byte readByte (String message) {

        while (true) {
            try {
                System.out.println(message);
                byte value = Byte.parseByte(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }




}
