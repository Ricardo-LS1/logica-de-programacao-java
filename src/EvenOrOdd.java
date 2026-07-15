/*
Given an integer, print whether it is even or odd.
 */
public class EvenOrOdd {
    static void main(String[] args) {
        // + - / * %
        int number = 8;
        String numberString;
        if (number % 2 == 0) {
            numberString = "Even";
        } else {
            numberString = "Odd";
        }
        System.out.println("Number " + number + " is " + numberString);
    }
}
