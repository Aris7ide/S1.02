package com;

import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        System.out.println(message);
        return scanner.nextByte();
    }

}
