import java.util.Scanner;

/*
As the system administrator, I would like to allow users to register their own username (login) in the system to streamline the migration process from the old system to the new one.

The user cannot leave the login blank ("") or create a user with the login "admin" or "administrator".

If the entered value is valid, the system must display the message:
        "<username> registered successfully"

Otherwise, the system must display the error:
        "Invalid user"
*/

public class InteractiveLoginRegistration {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.nextLine();

        if (username.isBlank() || username.equalsIgnoreCase("admin") || username.equalsIgnoreCase("administrator")) {
            System.out.println("Invalid user");
        } else {
            System.out.println("User \"" + username + "\" registered successfully.");
        }
    }
}
