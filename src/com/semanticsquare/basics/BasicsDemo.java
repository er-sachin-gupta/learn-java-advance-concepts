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

    public static void main(String[] args) {
        primitives();
        System.out.println(1 - 0.9);
        System.out.println(0.1 + 0.2);

        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price * discountPercent;
        System.out.println(price - discountAmount);
        System.out.println(price * (1 - discountPercent));

        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));
    }
}
