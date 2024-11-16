package com.semanticsquare.basics;

public class Recursion {

    static int factorialNR(int n) {
        if (n==0 || n==1) {
            return 1;
        }

        int factorial = n;

        while(n > 2) {
            factorial = factorial * (n-1);
            n--;
        }

        return factorial;
    }

    static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialNR(5));
        System.out.println(factorial(5));
    }

}
