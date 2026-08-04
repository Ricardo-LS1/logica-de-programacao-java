package io.github.ricardo_ls1.onlyExercises;

/*
Create a program that compares the planned study time with the actual
study time for different subjects.

The program must:

- Ask the user how many subjects will be registered;
- Store the name of each subject in a String array;
- Store the planned study minutes in an int array;
- Store the actual study minutes in another int array;
- Not accept negative values for study time.

At the end, display:

- The planned and actual study time for each subject;
- Whether the goal for each subject was reached;
- The total planned study time;
- The total actual study time;
- How many subjects reached their goals;
- The subject with the greatest amount of actual study time;
- Whether the overall study plan was completed;
- How many minutes were missing or exceeded the overall plan.
*/

import java.util.Scanner;

public class StudyPlanComparisonExercise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects = 0;

        do {
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
        } while (numberOfSubjects <= 0);

        String[] subjectNames = new String[numberOfSubjects];
        int[] plannedStudyMinutes = new int[numberOfSubjects];
        int[] actualStudyMinutes = new int[numberOfSubjects];

        scanner.nextLine();

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < numberOfSubjects; i++) {
            do {
                System.out.print("Enter the planned study minutes for "
                        + subjectNames[i] + ": ");

                plannedStudyMinutes[i] = scanner.nextInt();
            } while (plannedStudyMinutes[i] < 0);
        }

        for (int i = 0; i < numberOfSubjects; i++) {
            do {
                System.out.println("Enter the actual study minutes for "
                        + subjectNames[i] + ": ");

                actualStudyMinutes[i] = scanner.nextInt();
            } while (actualStudyMinutes[i] < 0);
        }

        int totalPlannedStudyMinutes = 0;
        int totalActualStudyMinutes = 0;
        int subjectsThatReachedGoal = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            totalPlannedStudyMinutes += plannedStudyMinutes[i];
            totalActualStudyMinutes += actualStudyMinutes[i];

            if (actualStudyMinutes[i] >= plannedStudyMinutes[i]) {
                subjectsThatReachedGoal++;
            }
        }
        int mostStudiedSubjectIndex = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            if (actualStudyMinutes[i] > actualStudyMinutes[mostStudiedSubjectIndex]) {

                mostStudiedSubjectIndex = i;
            }
        }

        System.out.println("\n--- Study Report ---");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("\nSubject: " + subjectNames[i]);
            System.out.println("Planned study minutes: " + plannedStudyMinutes[i]);
            System.out.println("Actual study minutes: " + actualStudyMinutes[i]);

            if (actualStudyMinutes[i] >= plannedStudyMinutes[i]) {
                System.out.println("Goal reached.");
            } else {
                System.out.println("Goal not reached.");
            }
        }

        System.out.println("\n--- Overall Results ---");
        System.out.println("Total planned study minutes: " + totalPlannedStudyMinutes);
        System.out.println("Total actual study minutes: " + totalActualStudyMinutes);
        System.out.println("Subjects that reached the goal: " + subjectsThatReachedGoal);
        System.out.println("Most studied subject:  " + subjectNames[mostStudiedSubjectIndex]);
        System.out.println("Minutes studied in this subject: " + actualStudyMinutes[mostStudiedSubjectIndex]);
    }
}
