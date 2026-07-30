package io.github.ricardo_ls1.arrays.multidimensional;

import java.util.Scanner;

public class MultidimensionalArraysInitializationLesson02 {
    static void main(String[] args) {
        int[][] multidimensionalArray1 = new int[2][3];
//        multidimensionalArray1[0][0] = 22;
//        multidimensionalArray1[0][1] = 11;
//        multidimensionalArray1[0][2] = 54;
//        multidimensionalArray1[1][0] = 44;
//        multidimensionalArray1[1][1] = 55;
//        multidimensionalArray1[1][2] = 76;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < multidimensionalArray1.length; i++) {
            for (int j = 0; j < multidimensionalArray1[i].length; j++) {
                System.out.print("Enter the value for position [" + i + "][" + j + "]: ");
                multidimensionalArray1[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < multidimensionalArray1.length; i++) {
            for (int j = 0; j < multidimensionalArray1[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + multidimensionalArray1[i][j]);
            }
        }
        scanner.close();
    }
}
