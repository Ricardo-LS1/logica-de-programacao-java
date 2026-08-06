package io.github.ricardo_ls1.onlyExercises;

// Store the temperatures of seven days and display the average,
// the highest temperature, and the number of days above the average.

import java.util.Scanner;

public class WeeklyTemperatureAnalyzerExercise {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[7];
        double sumOfTemperatures = 0;

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();

            sumOfTemperatures = temperatures[i] + sumOfTemperatures;
        }
        double avgTemperature = sumOfTemperatures / temperatures.length;
        System.out.print("The sum of temperatures is " + sumOfTemperatures);
        System.out.print("The average temperature is " + avgTemperature);

        double highestTemperature = temperatures[0];
        int daysAboveTheAvgTemperature = 0;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }
        }

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > avgTemperature) {
                daysAboveTheAvgTemperature++;
            }
        }

        System.out.print("The highest temperature is: " + highestTemperature);
        System.out.print("The number of days above the average temperature is " + daysAboveTheAvgTemperature);
        scanner.close();
    }
}

