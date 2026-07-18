import java.util.Scanner;

/*
As a military enlistment officer, I would like the system to accept the following information so that I can speed up the registration process:

Gender, accepting only M or F, and age.

If the gender is male and the person is 18 or older, the system must print:
        "Military enlistment is mandatory."

If the gender is male and the person is under 18, the system must print:
        "Military enlistment is not allowed."

If the gender is female and the person is 18 or older, the system must ask whether she would like to enlist.

If the gender is female and the person is under 18, the system must print:
        "Military enlistment is not allowed."
*/
public class InteractiveMilitaryEnlistment {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender (M or F): ");
        String gender = input.next();
        System.out.println("Enter your age: ");
        if (input.hasNextInt()) {
            int age = input.nextInt();

            if (gender.equalsIgnoreCase("M") && age >= 18) {
                System.out.println("Military enlistment is mandatory.");
            } else if (gender.equalsIgnoreCase("M")) {
                System.out.println("Military enlistment is not allowed.");
            } else if (gender.equalsIgnoreCase("F") && age >= 18) {
                System.out.println("Would you like to enlist? (YES or NO).");
                String response = input.next();
                if (response.equalsIgnoreCase("YES")) {
                    System.out.println("Enlistment completed.");
                } else if (response.equalsIgnoreCase("NO")) {
                    System.out.println("Program ended.");
                } else {
                    System.out.println("Invalid response. Please enter \"YES\" or \"NO\".");
                }
            } else if (gender.equalsIgnoreCase("F")) {
                System.out.println("Military enlistment is not allowed.");
            } else {
                System.out.println("Invalid gender. Please enter \"M\" or \"F\".");
            }
        } else {
            System.out.println("Invalid age. Please enter a valid integer.");
        }
        input.close();
    }
}

