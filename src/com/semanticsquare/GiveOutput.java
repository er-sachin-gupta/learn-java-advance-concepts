package com.semanticsquare;

public class GiveOutput {
    static Integer i = 1;

    public static void m(Integer i) {
        i += 2;
    }

    public static void main(String[] args) {
        System.out.println(i + "");
        m(i);
        System.out.println(i);
    }
}
