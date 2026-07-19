package io.github.ricardo_ls1.variables;

/*
Create a class that calculates a given percentage of a salary.
* Create a class
* Accept a salary value as input
* Define the percentage value
* Calculate the percentage
 */
public class TaxCalculator {
    static void main(String[] args) {
        float salary = 1500F;
        float percentage = 0.1F;
        float calculatedPercentage = salary * percentage;
        System.out.println("The calculated percentage of the salary is: " + calculatedPercentage);
    }
}
