package com.semanticsquare.basics;

public class DotProductCalculator {

    public static int dotProduct(int[] a, int[] b) {
        int sum =0;
        for (int i=0, j=0; i< a.length; i++, j++) {
            sum += a[i]*b[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {2,0,4};
        int[] b = {1,4,3};
        System.out.println("Dot product of 2 arrays is : " + dotProduct(a, b));
    }
}
