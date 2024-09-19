package com.semanticsquare;

public class Student {
    int id; // Make it global variable

    void compute() {
//        int id = 1000; Another Fix
        int nextId = id + 1; // Giving error because id variable has not been initialized manually
        // and also as it is a local variable it has not been initialized automatically, if it will be a global or static variable it will surely get default value
        System.out.println(id);
        System.out.println(nextId);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }

}
