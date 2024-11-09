package com.semanticsquare.basics;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] gpaList = new double[studentIdList.length];
        int index =0;
        for(char[] studentGrades: studentsGrades) {
            double sumOfGrades = 0;
            for (char grade : studentGrades) {
//                sumOfGrades += getNumberForGrade(grade);
                if (grade == 'A')
                    sumOfGrades += 4.0;
                else if(grade == 'B')
                    sumOfGrades += 3.0;
                else if(grade == 'C')
                    sumOfGrades += 2.0;
            }
            gpaList[index++] = sumOfGrades / studentGrades.length;
        }
        return gpaList;
    }

    private static double getNumberForGrade(char grade) {
        return switch(grade) {
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            default -> 0.0;
        };

    }

    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if (lower < 0 || higher < 0 || lower > higher || studentIdList.length == 0 || studentsGrades.length == 0)
            return null;

        // invoke calculateGPA
        double[] gpaList = calculateGPA(studentIdList, studentsGrades);

        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
        int count = 0;
        for (double gpa : gpaList) {
            if (gpa <= higher && gpa >= lower)
                count++;
        }

        int[] result = new int[count];
        for (int i = 0, index=0; i< gpaList.length; i++) {
            if (gpaList[i] <= higher && gpaList[i] >= lower) {
                result[index++] = studentIdList[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] studentIdList = { 1001, 1002, 1003};
        char[][] studentsGrades = { {'A', 'A', 'A', 'B'}, {'B', 'B', 'B', 'A'}, {'A', 'A', 'B'}};
        double[] gpaList = calculateGPA(studentIdList, studentsGrades);
        for (double gpa: gpaList) {
            System.out.println("gpa: " + gpa);
        }
        int[] id = getStudentsByGPA(3.5, 4.0, studentIdList, studentsGrades);
        for (int val: id) {
            System.out.println("id: " + val);
        }
    }

}
