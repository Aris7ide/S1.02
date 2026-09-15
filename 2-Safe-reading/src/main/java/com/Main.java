package com;

import com.ConsoleReader;

import static com.ConsoleReader.readByte;

public class Main {

    static void main(String[] args) {

        byte valueByte = ConsoleReader.readByte("Escribe un valor considerado byte:");
        int valueInteger = ConsoleReader.readInt("Escribe un valor considerado Integer");
        float valueFloat = ConsoleReader.readFloat("Escribe un valor considerado Float");
        double valueDouble = ConsoleReader.readDouble("Escribe un valor considerado Double");

        char valueChar = ConsoleReader.readChar("Escribe una sola letra");

    }
}

