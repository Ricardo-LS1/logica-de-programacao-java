package io.github.ricardo_ls1.loops.whiles;

import java.util.Scanner;

public class DoWhileLesson05 {
    static void main(String[] args) {
        int continuePlaying;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("PLAYER 1: Enter a number from 1 to 10.");
            int num1 = input.nextInt();
            System.out.println("PLAYER 2: Enter a number from 1 to 10.");
            int num2 = input.nextInt();
            System.out.println("--------------------------------");
            System.out.println("The numbers match: " + (num1 == num2));
            System.out.println("""
                    Would you like to continue playing?
                    1. YES  
                    2. NO
                    """);

            continuePlaying = input.nextInt();
        } while (continuePlaying == 1);
        System.out.println("Game over.");
        input.close();
    }
}
