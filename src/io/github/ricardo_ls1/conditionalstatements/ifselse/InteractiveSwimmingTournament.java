package io.github.ricardo_ls1.conditionalstatements.ifselse;

import java.util.Scanner;

/*
As a user, I would like to have the names and ages of the participants in a swimming
tournament, and I would like the system to display the following:

Under 10 years old: <Name> will participate in the Children’s category.
Between 11 and 15 years old: <Name> will participate in the Junior category.
Between 16 and 19 years old: <Name> will participate in the Pre-Adult category.
Over 20 years old: <Name> will participate in the Adult category.

So that I can quickly classify all participants.

Additional reading:
Software development processes
Agile methodologies
Scrum
 */
public class InteractiveSwimmingTournament {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
        String category;
        if (age < 10) {
            category = "Children's";
        } else if (age <= 15) {
            category = "Junior";
        } else if (age <= 19) {
            category = "Pre-Adult";
        } else {
            category = "Adult";
        }
        System.out.println(name + " will participate in the " + category + " category");
    }
}
