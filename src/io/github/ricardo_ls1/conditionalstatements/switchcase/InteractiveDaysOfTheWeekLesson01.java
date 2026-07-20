package io.github.ricardo_ls1.conditionalstatements.switchcase;

import java.util.Scanner;

//Receive an integer from the user and print the corresponding day of the week, with 1 representing Monday.

public class InteractiveDaysOfTheWeekLesson01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7.");
        if (input.hasNextInt()) {
            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Only numbers from 1 to 7 are allowed.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number from 1 to 7.");
        }
        input.close();
    }
}
