package io.github.ricardo_ls1.arrays.one_dimensional;

import java.util.Scanner;

public class ArraysWithForLoopLesson02 {
    static void main(String[] args) {
        double[] grades = new double[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter your grade " + (i + 1));
            grades[i] = input.nextDouble();
        }
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            average = average + grades[i];
            System.out.println("Your grade " + (i + 1) + " is " + grades[i]);

        }
        average = average / grades.length;
        System.out.println("The average is: " + average);
        input.close();
    }
}
