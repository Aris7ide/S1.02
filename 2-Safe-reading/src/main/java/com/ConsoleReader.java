package com;

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
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("El valor no es valido");
                scanner.nextLine();
            }
        }
    }
}
