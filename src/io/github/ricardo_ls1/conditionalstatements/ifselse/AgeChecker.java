package io.github.ricardo_ls1.conditionalstatements.ifselse;

/*
Receive an age as input.

If the age is greater than 18, print "Adult".
Otherwise, print "Not an adult yet".
 */
public class AgeChecker {
    static void main(String[] args) {
        int age = 17;
        // ==, !=, >, >=, <, <=
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an adult yet");
        }
    }
}
