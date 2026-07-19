package io.github.ricardo_ls1.conditionalstatements.ifselse;

public class IncomeTax {
    static void main(String[] args) {
        double salary = 40000D;
        if (salary <= 2428.80) {
            System.out.println("Tax-exempt");
        } else if (salary >= 2428.81 && salary <= 2826.65) {
            System.out.println("Tax rate: 7.5% | Tax amount: " + salary * 0.075);
        } else if (salary >= 2826.66 && salary <= 3751.05) {
            System.out.println("Tax rate: 15% | Tax amount: " + salary * 0.15);
        } else if (salary >= 3751.06 && salary <= 4664.68) {
            System.out.println("Tax rate: 22.5% | Tax amount: " + salary * 0.225);
        } else {
            System.out.println("Tax rate: 27.5% | Tax amount: " + salary * 0.275);
        }
    }
}
