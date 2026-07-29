package io.github.ricardo_ls1.arrays.multidimensional;

public class MultidimensionalArraysIntroductionLesson01 {
    static void main(String[] args) {
        int[][] multidimensionalArray1 = new int[2][2];
        multidimensionalArray1[0][0] = 22;
        multidimensionalArray1[0][1] = 11;
        multidimensionalArray1[1][0] = 44;
        multidimensionalArray1[1][1] = 55;

        System.out.println(multidimensionalArray1[0][0]);
        System.out.println(multidimensionalArray1[0][1]);
        System.out.println(multidimensionalArray1[1][0]);
        System.out.println(multidimensionalArray1[1][1]);
    }
}
