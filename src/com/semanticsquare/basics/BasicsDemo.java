package com.semanticsquare.basics;

public class BasicsDemo {

    static void primitives() {
        System.out.println("\n\nInside Primitives...");
        int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
        System.out.println("intHex :  " + intHex);

        // Java 7
        int intBinary = 0b01000001;
        System.out.println("intBinary :  " + intBinary);
    }

    public static void main(String[] args) {
        primitives();
    }
}
