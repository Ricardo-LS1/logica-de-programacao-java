package io.github.ricardo_ls1.arrays.one_dimensional;

// Store 3 integer values in two arrays, V1 and V2, and display the result of multiplying each value in V1 by its corresponding value in V2.

import java.util.Scanner;

public class ArraysExerciseLesson03 {
    static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] resultArray = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array 1, position " + i + ": ");
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Array 2, position " + i + ": ");
            array2[i] = input.nextInt();
        }
        System.out.print("Multiplied result array: ");
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array1[i] * array2[i];
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
