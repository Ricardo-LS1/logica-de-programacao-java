package io.github.ricardo_ls1.arrays;

// Store 3 integer values in two arrays, V1 and V2, and display the result of multiplying each value in V1 by its corresponding value in V2.

import java.util.Scanner;

public class ImprovedArraysExerciseLesson03 {
    static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] resultArray = new int[3];
        String multiplicationResults = "";
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array 1, position " + i + ": ");
            array1[i] = input.nextInt();
            System.out.print("Array 2, position " + i + ": ");
            array2[i] = input.nextInt();
            resultArray[i] = array1[i] * array2[i];
            multiplicationResults = multiplicationResults + resultArray[i] + " ";
        }
        System.out.println();
        System.out.println("Multiplication results: " + multiplicationResults);
        input.close();
    }
}
