import java.util.Scanner;

//Receive an integer from the user and print the corresponding day of the week, with 1 representing Monday.

public class InteractiveDaysOfTheWeek {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7.");

        if (input.hasNextInt()) {

            int number = input.nextInt();

            if (number == 1) {
                System.out.println("Monday");

            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else if (number == 7){
                System.out.println("Sunday");
            } else {
                System.out.println("Only numbers from 1 to 7 are allowed.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number from 1 to 7.");
        }
        input.close();
    }
}

