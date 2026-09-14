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
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: el numero no es un byte");
                scanner.nextLine();
            }
        }

    }

    public static int readInt (String message) {

        while (true) {
            try {
                System.out.println(message);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un int");
                scanner.nextLine();
            }
        }

    }

    public static float readFloat (String message) {

        while (true) {
            try {
                System.out.println(message);
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un float");
                scanner.nextLine();
            }
        }

    }

    public static double readDouble (String message) {

        while (true) {
            try {
                System.out.println(message);
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: el dato no es un double");
                scanner.nextLine();
            }
        }

    }




}
