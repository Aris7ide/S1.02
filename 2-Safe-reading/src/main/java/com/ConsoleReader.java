package com;

import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    private ConsoleReader() {}

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


}
