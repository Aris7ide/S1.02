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

    public static int readInt (String message) {

        while (true) {
            try {
                System.out.println(message);
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un int");
            }
        }

    }

    public static float readFloat (String message) {

        while (true) {
            try {
                System.out.println(message);
                float value = Float.parseFloat(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un float");
            }
        }

    }

    public static double readDouble (String message) {

        while (true) {
            try {
                System.out.println(message);
                double value = Double.parseDouble(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un double");
            }
        }

    }




}
