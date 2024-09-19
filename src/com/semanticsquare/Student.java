package com.semanticsquare;

public class Student {
    int id;
    id = 1000; // initialize at this level is not permitted
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
