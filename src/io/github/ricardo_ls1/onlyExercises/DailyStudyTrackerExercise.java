package io.github.ricardo_ls1.onlyExercises;

/*
Create a program to record multiple study sessions completed during the day.

The program must display a menu with the following subjects:

1 - English
2 - Mathematics
3 - Portuguese
4 - Java
5 - SQL
6 - Linux
0 - Exit

For each study session, the user must choose a subject and enter the number
of minutes studied. The program must add the minutes to the selected subject.

The menu must continue to be displayed until the user chooses option 0.

At the end, the program must display:

- The total number of minutes studied for each subject;
- The total number of minutes studied during the day;
- Whether the daily goal of 240 minutes was achieved;
- The subject with the highest number of study minutes;
- The number of subjects studied during the day.
*/

import java.util.Scanner;

public class DailyStudyTrackerExercise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        int englishMinutes = 0;
        int mathematicsMinutes = 0;
        int portugueseMinutes = 0;
        int javaMinutes = 0;
        int sqlMinutes = 0;
        int linuxMinutes = 0;
        int minutes = 0;

        do {
            System.out.println("1 - English");
            System.out.println("2 - Mathematics");
            System.out.println("3 - Portuguese");
            System.out.println("4 - Java");
            System.out.println("5 - SQL");
            System.out.println("6 - Linux");
            System.out.println("0 - Exit");
            System.out.print("Choose a subject: ");

            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                System.out.print("Enter the number of minutes studied: ");
                minutes = scanner.nextInt();

                while (minutes <= 0) {
                    System.out.println("Invalid number of minutes.");
                    System.out.print("Enter a value greater than zero:");
                    minutes = scanner.nextInt();
                }
            }

            switch (option) {
                case 1:
                    englishMinutes += minutes;
                    break;
                case 2:
                    mathematicsMinutes += minutes;
                    break;
                case 3:
                    portugueseMinutes += minutes;
                    break;
                case 4:
                    javaMinutes += minutes;
                    break;
                case 5:
                    sqlMinutes += minutes;
                    break;
                case 6:
                    linuxMinutes += minutes;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println();
        } while (option != 0);

        int totalMinutes;
        int highestMinutes = 0;
        String mostStudiedSubject = "";
        totalMinutes = englishMinutes + mathematicsMinutes + portugueseMinutes + javaMinutes + sqlMinutes + linuxMinutes;

        System.out.println("==== DAILY SUMMARY ====");
        System.out.println("English: " + englishMinutes + " minutes");
        System.out.println("Mathematics: " + mathematicsMinutes + " minutes");
        System.out.println("Portuguese: " + portugueseMinutes + " minutes");
        System.out.println("Java: " + javaMinutes + " minutes");
        System.out.println("SQL: " + sqlMinutes + " minutes");
        System.out.println("Linux: " + linuxMinutes + " minutes");
        System.out.println();
        System.out.println("Total studied: " + totalMinutes + " minutes");

        if (totalMinutes >= 240) {
            System.out.println("Daily goal achieved!");
        } else {
            System.out.println("Daily goal not achieved.");
        }

        if (englishMinutes > highestMinutes) {
            highestMinutes = englishMinutes;
            mostStudiedSubject = "English";
        }
        if (mathematicsMinutes > highestMinutes) {
            highestMinutes = mathematicsMinutes;
            mostStudiedSubject = "Mathematics";
        }
        if (portugueseMinutes > highestMinutes) {
            highestMinutes = portugueseMinutes;
            mostStudiedSubject = "Portuguese";
        }
        if (javaMinutes > highestMinutes) {
            highestMinutes = javaMinutes;
            mostStudiedSubject = "Java";
        }
        if (sqlMinutes > highestMinutes) {
            highestMinutes = sqlMinutes;
            mostStudiedSubject = "SQL";
        }
        if (linuxMinutes > highestMinutes) {
            highestMinutes = linuxMinutes;
            mostStudiedSubject = "Linux";
        }

        if (totalMinutes == 0) {
            System.out.println("No subjects were studied.");
        } else {
            System.out.println("Most studied subject: " + mostStudiedSubject);
            System.out.println("Highest number of minutes: " + highestMinutes);
        }

        int studiedSubjects = 0;

        if (englishMinutes > 0) {
            studiedSubjects++;
        }
        if (mathematicsMinutes > 0) {
            studiedSubjects++;
        }
        if (portugueseMinutes > 0) {
            studiedSubjects++;
        }
        if (javaMinutes > 0) {
            studiedSubjects++;
        }
        if (sqlMinutes > 0) {
            studiedSubjects++;
        }
        if (linuxMinutes > 0) {
            studiedSubjects++;
        }
        System.out.println("Subjects studied: " + studiedSubjects);
        System.out.println("Program finished.");
    }
}
