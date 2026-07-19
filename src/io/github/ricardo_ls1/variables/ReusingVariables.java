package io.github.ricardo_ls1.variables;

/*
Create a variable to store a salary value.
Calculate the following percentages of that salary:
* 30%
* 15%
* 5%
Each time you perform a calculation, store the result in a variable.
Print the result and reuse the variable that stores it for the next calculation.
*/
public class ReusingVariables {
    public static void main(String[] args) {
        double salary = 1000;
        double result = salary * 0.3;
        System.out.println("30% is: " + result);
        result = salary * 0.15;
        System.out.println("15% is: " + result);
        result = salary * 0.05;
        System.out.println("5% is: " + result);
    }
}
