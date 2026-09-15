package com;

import com.ConsoleReader;

public class Main {

    static void main(String[] args) {

        //String nombre = ConsoleReader.readString("Introduce tu nombre:");
        byte b = ConsoleReader.readByte("Introduce un dato de tipo byte:");
        int i = ConsoleReader.readInt("Introduce un dato de tipo int:");
        float f = ConsoleReader.readFloat("Introduce un dato de tipo float");
        double d = ConsoleReader.readDouble("Introduce un dato de tipo double");

        System.out.println("Y AHORA CON EXCEPCIONES PERSONALIZADAS");

        char c = ConsoleReader.readChar("Introduce un char");

        //String s = ConsoleReader.readString("Introduce una frase con menos de 20 letras:");

        //boolean bo = ConsoleReader.readYesOrNo("y or n?");


    }
}

