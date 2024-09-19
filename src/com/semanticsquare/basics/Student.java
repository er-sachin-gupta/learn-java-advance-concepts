package com.semanticsquare.basics;

public class Student {
    int id = 1000;
    /*
    Solution to either assign int id =1000 on line 4 or inside method make this assignment like on line 11
     */
    byte age = 18;
//    byte rank = 165; // possible lossy conversion from int to byte Error becuase byte can hold upto -128 to 127
    short rank = 165;
//    int phone = 2234567890; //integer number too large: 2234567890
    long phone = 223_456_7890L;

    // Integer Literals : int literal, long literal

//    int minValue = Integer.MIN_VALUE;
//    int maxValue = Integer.MAX_VALUE;

    byte minValue = Byte.MIN_VALUE;
    byte maxValue = Byte.MAX_VALUE;

    void compute() {
        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("Phone : " + phone);
        System.out.println("MinValue : " + minValue);
        System.out.println("MaxValue : " + maxValue);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }

}
