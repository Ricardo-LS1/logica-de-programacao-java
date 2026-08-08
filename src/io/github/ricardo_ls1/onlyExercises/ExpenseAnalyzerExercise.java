package io.github.ricardo_ls1.onlyExercises;

/*
The program should:

Ask the user for the expense of each day.
Calculate the total amount spent.
Calculate the average daily expense.
Find the highest expense.
Count how many days had expenses above the average.
 */

import java.util.Scanner;

public class ExpenseAnalyzerExercise {
    static void main(String[] args) {
        int[] expense = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < expense.length; i++) {
            System.out.print("Enter your expense for day " + (i + 1) + ": ");
            expense[i] = scanner.nextInt();
        }
        int totalAmountExpense = 0;

        for (int i = 0; i < expense.length; i++) {
            totalAmountExpense = totalAmountExpense + expense[i];
        }
        double avg = (double) totalAmountExpense / expense.length;

        System.out.println();
        System.out.println("The total amount spent is " + totalAmountExpense);
        System.out.println("The average daily expense is " + avg);

        int highestExpense = expense[0];

        for (int i = 1; i < expense.length; i++) {
            if (expense[i] > highestExpense) {
                highestExpense = expense[i];
            }
        }
        System.out.println("The highest expense is " + highestExpense);

        int daysAboveAvg = 0;

        for (int i = 0; i < expense.length; i++) {
            if (expense[i] > avg) {
                daysAboveAvg++;
            }
        }
        System.out.println("Days above average: " + daysAboveAvg);
        scanner.close();
    }
}
