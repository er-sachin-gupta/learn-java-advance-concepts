package com.semanticsquare.basics;

  /*
	Instance & Static:
	- Declared at class-level
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:

	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables.
*/

public class InstanceStaticVariableStudent {
    static int computeCount;

    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    boolean international;
    double tuitionFees  = 12000.0, internationalFees = 5000.0;
//    double internationalFees  = tuitionFees = 5000.0;

    void compute() {
        computeCount = computeCount + 1;
        int nextId = id + 1;

        if (international) {
            tuitionFees = tuitionFees + internationalFees;
        }

        System.out.println("\nid: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("Phone : " + phone);
        System.out.println("gpa : " + gpa);
        System.out.println("degree : " + degree);
        System.out.println("tuitionFees : " + tuitionFees);
        System.out.println("computeCount : " + computeCount);
    }

//    static InstanceStaticVariableStudent student3;

    public static void main(String[] args) {
        InstanceStaticVariableStudent instanceStaticVariableStudent1 = new InstanceStaticVariableStudent();
        instanceStaticVariableStudent1.id = 1000;
        instanceStaticVariableStudent1.name = "John";
        instanceStaticVariableStudent1.gender = "Male";
        instanceStaticVariableStudent1.age = 18;
        instanceStaticVariableStudent1.phone = 223_456_7890L;
        instanceStaticVariableStudent1.gpa = 3.8;
        instanceStaticVariableStudent1.degree = 'B';
        instanceStaticVariableStudent1.international = false;
        instanceStaticVariableStudent1.compute();

        InstanceStaticVariableStudent instanceStaticVariableStudent2 = new InstanceStaticVariableStudent();
        instanceStaticVariableStudent2.id = 1001;
        instanceStaticVariableStudent2.name = "Raj";
        instanceStaticVariableStudent2.gender = "Male";
        instanceStaticVariableStudent2.age = 21;
        instanceStaticVariableStudent2.phone = 223_456_9999L;
        instanceStaticVariableStudent2.gpa = 3.4;
        instanceStaticVariableStudent2.degree = 'M';
        instanceStaticVariableStudent2.international = true;
        instanceStaticVariableStudent2.compute();

        InstanceStaticVariableStudent instanceStaticVariableStudent3 = new InstanceStaticVariableStudent();
        instanceStaticVariableStudent3.id = 1002;
        instanceStaticVariableStudent3.name = "Anita";
        instanceStaticVariableStudent3.gender = "female";
        instanceStaticVariableStudent3.age = 20;
        instanceStaticVariableStudent3.phone = 223_456_8888L;
        instanceStaticVariableStudent3.gpa = 4.0;
        instanceStaticVariableStudent3.degree = 'M';
        instanceStaticVariableStudent3.international = true;
        instanceStaticVariableStudent3.compute();

        System.out.println("InstanceStaticVariableStudent.computeCount : " + InstanceStaticVariableStudent.computeCount);
    }

}
