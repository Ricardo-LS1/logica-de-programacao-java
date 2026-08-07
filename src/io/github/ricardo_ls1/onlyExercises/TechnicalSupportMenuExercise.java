package io.github.ricardo_ls1.onlyExercises;

/*
The program should display these options:

Internet connection problem
Slow computer
Forgotten password
Software installation
 */

import java.util.Scanner;

public class TechnicalSupportMenuExercise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Choose an option: ");
            System.out.println("""
                    1. Internet connection problem;
                    2. Slow computer
                    3. Forgotten password
                    4. Software installation
                    0. CLOSE
                    """);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("recommendation for internet connection problems");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("recommendation for a slow computer");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("recommendation for a forgotten password");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("recommendation for software installation");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Closing...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid option.");
                    System.out.println();
            }
        } while (option != 0);
        System.out.println("Program finished.");
    }
}

