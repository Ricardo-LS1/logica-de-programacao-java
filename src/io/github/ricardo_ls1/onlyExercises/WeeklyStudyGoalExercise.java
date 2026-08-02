package io.github.ricardo_ls1.onlyExercises;

// Ask the user how many minutes they studied on each day of the week.
// Calculate the total number of minutes studied.
//
// Then display:
// 1. The total study time.
// 2. The average study time per day.
// 3. Whether the weekly goal of 420 minutes was reached.
// 4. How many minutes are missing if the goal was not reached.

import java.util.Scanner;

public class WeeklyStudyGoalExercise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMinutes = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Minutes studied on day " + i + ": ");
            int minutes = scanner.nextInt();

            totalMinutes = totalMinutes + minutes;

        }
        double dailyAverage = totalMinutes / 7.0;
        int weeklyGoal = 420;

        System.out.println("\nTotal study time: " + totalMinutes + " minutes");
        System.out.println("Daily average: " + dailyAverage + " minutes");

        if (totalMinutes >= weeklyGoal) {
            System.out.println("Weekly goal reached!");
        } else {
            int missingMinutes = weeklyGoal - totalMinutes;

            System.out.println("Weekly goal not reached.");
            System.out.println("Missing minutes: " + missingMinutes);
        }

        scanner.close();
    }
}
