package com.semanticsquare.basics;

import java.math.BigDecimal;

public class BasicsDemo {

    static void primitives() {
        System.out.println("\n\nInside Primitives...");
        int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
        System.out.println("intHex :  " + intHex);

        // Java 7
        int intBinary = 0b01000001;
        System.out.println("intBinary :  " + intBinary);

        int intChar = 'A';
        System.out.println("intChar " + intChar);

        char charInt = 0;
        System.out.println("charInt : " + charInt);

        char charHex = 0x0041;
        System.out.println("charHex : " + charHex);

        char charBinary = 0b0100_0001;
        System.out.println("charBinary : " + charBinary);
    }

    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println();                 // Print empty line
        System.out.print("Hello, world!!");   // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" ");                // Print a space
        System.out.print("world!!");
    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit casting
        long y = 42;
//        int x = y;
        int x = (int)y;

        // Information loss due to out-of-range assignment
        byte narrowdByte = (byte)123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);
    }

    public static void main(String[] args) {
        primitives();
        /*System.out.println(1 - 0.9);
        System.out.println(0.1 + 0.2);

        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price * discountPercent;
        System.out.println(price - discountAmount);
        System.out.println(price * (1 - discountPercent));

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));*/
        typeCasting();
    }
}
