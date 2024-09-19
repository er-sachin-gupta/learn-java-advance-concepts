package com.semanticsquare.basics;

public class Student {
    int id = 1000;
    /*
    Solution to either assign int id =1000 on line 4 or inside method make this assignment like on line 11
     */

    void compute() {
        int nextId = id + 1;
        System.out.println(id);
        System.out.println(nextId);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }

}
