import java.util.Scanner;

public class ReadingInputFromKeyboard {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
        System.out.println("The name entered was: " + name);
        System.out.println("The age entered was: " + age);
    }
}
