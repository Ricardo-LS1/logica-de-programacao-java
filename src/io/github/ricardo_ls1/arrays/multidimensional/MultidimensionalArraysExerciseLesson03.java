package io.github.ricardo_ls1.arrays.multidimensional;

// Calculate the product of the elements on the main diagonal of a square matrix.

public class MultidimensionalArraysExerciseLesson03 {
    static void main(String[] args) {
        int[][] multidimensionalArray1 = new int[3][3];
        multidimensionalArray1[0][0] = 22;
        multidimensionalArray1[0][1] = 11;
        multidimensionalArray1[0][2] = 4;
        multidimensionalArray1[1][0] = 44;
        multidimensionalArray1[1][1] = 55;
        multidimensionalArray1[1][2] = 9;
        multidimensionalArray1[2][0] = 2;
        multidimensionalArray1[2][1] = 5;
        multidimensionalArray1[2][2] = 21;

        int mainDiagonalProduct = 1;
        for (int i = 0; i < multidimensionalArray1.length; i++) {
            for (int j = 0; j < multidimensionalArray1[i].length; j++) {
                if (i == j) {
                    mainDiagonalProduct = mainDiagonalProduct * multidimensionalArray1[i][j];
                }
            }
        }
        System.out.println(mainDiagonalProduct);
    }
}

