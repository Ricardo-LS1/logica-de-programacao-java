package io.github.ricardo_ls1.loops.whiles;

// As a user, I would like to print all odd numbers from 0 up to the value entered by the user.

import java.util.Scanner;

public class OddNumbersExerciseLesson02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (input.hasNextInt()) {
            int number = input.nextInt();
            int i = 0;

            while (i <= number) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                }
                i = i + 1;
            }
        } else {
            System.out.println("Only integers are allowed.");
        }
        input.close();
    }
}
