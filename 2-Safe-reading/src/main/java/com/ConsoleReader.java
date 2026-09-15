package com;

import com.exceptions.InvalidCharLength;
import com.exceptions.InvalidStringLength;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es valido");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es valido");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es valido");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("El valor no es valido");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = scanner.nextLine();

                if (input.length() != 1) {
                    throw new InvalidCharLength("Tiene que ser una sola letra.");
                }

                return input.charAt(0);

            } catch (InvalidCharLength e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = scanner.nextLine().strip();

                if (input.length()>20) {
                    throw new InvalidStringLength("Maximo 20 letras");
                }

                return input;

            } catch (InvalidStringLength e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
