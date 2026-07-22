package io.github.ricardo_ls1.loops.whiles;

/*
As a user, I would like to have a visual menu that can be navigated using numbers.

The menu should be displayed as follows:

1. Calculate tax
2. Deposit salary
3. Exit

The menu should remain available until I enter the number 3.

This way, the system will remain running, avoiding the need to restart it after each operation.
 */

import java.util.Scanner;

public class InteractiveMenuLesson03 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("""
                    Please choose an option: 
                    1. Calculate tax 
                    2. Deposit salary 
                    3. Exit
                    """);

            if (input.hasNextInt()) {
                option = input.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
        System.out.println("Program finished.");
        input.close();
    }
}
