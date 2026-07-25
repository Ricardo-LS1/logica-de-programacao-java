package io.github.ricardo_ls1.loops.fors;

// As a user, I would like a system that automatically generates the multiplication tables from 1 to 10.

public class NestedForLoopExerciseLesson03 {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table for " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
