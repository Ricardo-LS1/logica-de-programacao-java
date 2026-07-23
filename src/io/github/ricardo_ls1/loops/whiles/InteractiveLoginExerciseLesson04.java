package io.github.ricardo_ls1.loops.whiles;

/*
Display a screen prompting the user for a username and then a password.

The correct username and password must be stored as constants in the program.

If the user enters the correct username and password, display:
"ACCESS GRANTED"

Otherwise, display:
"ACCESS DENIED"

Then ask for the username and password again. Repeat this process until the user enters the correct combination.
 */

import java.util.Scanner;

public class InteractiveLoginExerciseLesson04 {
    static void main(String[] args) {
        final String LOGIN = "Luffy";
        final String PASSWORD = "KingOfPirates";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your username: ");
            String enteredUsername = input.nextLine();
            System.out.print("Enter your password: ");
            String enteredPassword = input.nextLine();

            if (LOGIN.equals(enteredUsername) && PASSWORD.equals(enteredPassword)) {
                System.out.println("ACCESS GRANTED");
                break;
            }
            System.out.println("ACCESS DENIED");
        }
        System.out.println("PROGRAM ENDED");
        input.close();
    }
}

