package io.github.ricardo_ls1.conditionalstatements.ifselse;

/*
Given a salary value.

If the salary is greater than 4500, print 30% of its value.
Otherwise, print 15% of its value.

Challenge: Use only one variable to store the result and print it at the end.
Challenge2: Indicate in the output whether it is 30% or 15%.
 */
public class ConditionalTaxCalculator {
    static void main(String[] args) {
        float salary = 1000.50F;
        float result = 0F;
        String percentage = "";
        if (salary > 4500) {
            result = salary * 0.3F;
            percentage = "30%";
        } else {
            result = salary * 0.15F;
            percentage = "15%";
        }
        System.out.println("The tax rate is " + percentage + ", and the tax amount is : " + result);
    }
}
