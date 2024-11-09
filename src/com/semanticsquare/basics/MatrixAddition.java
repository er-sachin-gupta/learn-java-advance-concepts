package com.semanticsquare.basics;

public class MatrixAddition {

    public static void main(String[] args) {

        int[][] matrixA = {

                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}

        };

        int[][] matrixB = {

                {9, 8, 7},

                {6, 5, 4},

                {3, 2, 1}

        };



        // Call the addMatrices method and print the resulting matrix

        int[][] result = addMatrices(matrixA, matrixB);

        System.out.println("Resulting Matrix:");

        printMatrix(result);

    }



    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {

        // Your implementation here
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
        for (int i=0; i<matrixA.length; i++) {
            for (int j=0; j< matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return matrixC; // Replace this with the actual result

    }



    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int elem : row) {

                System.out.print(elem + " ");

            }

            System.out.println();

        }

    }

}
