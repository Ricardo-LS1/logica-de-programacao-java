package io.github.ricardo_ls1.arrays;

public class ArraysIntroductionLesson01 {
    static void main(String[] args) {
        double grade1 = 7.8;
        double grade2 = 8.6;
        double grade3 = 8;
        double grade4 = 9;
        double media = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println(media);
        System.out.println("-------------");
        double[] grades = new double[4];
        grades[0] = 7.8;
        grades[1] = 8.6;
        grades[2] = 8;
        grades[3] = 9;

        System.out.println("Array length: " + grades.length);

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
