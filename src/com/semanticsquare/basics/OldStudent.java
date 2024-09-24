package com.semanticsquare.basics;

public class OldStudent {
    int id = 1000;
    /*
    Solution to either assign int id =1000 on line 4 or inside method make this assignment like on line 11
     */
    byte age = 18;
//    byte rank = 165; // possible lossy conversion from int to byte Error becuase byte can hold upto -128 to 127
//    int phone = 2234567890; //integer number too large: 2234567890
    long phone = 223_456_7890L;

    // Integer Literals : int literal, long literal

    double gpa = 3.8;

//    char degree = '\u0000';
    char degree = 'B';

    boolean international = true;
    double tuitionFees  = 12000.0;
    double internationalFees  = 5000.0;

    void compute() {

        if (international) {
            tuitionFees = tuitionFees + internationalFees;
        }

        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("Phone : " + phone);
        System.out.println("gpa : " + gpa);
        System.out.println("degree : " + degree);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println("tuitionFees : " + tuitionFees);
    }

    public static void main(String[] args) {
        OldStudent s = new OldStudent();
        s.compute();
    }

}
