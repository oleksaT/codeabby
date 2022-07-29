package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of iterations: ");
        int iteration = scan.nextInt();
        int intAverage;

        for (int i = 0; i < iteration; i++) {
            ArrayList<Double> array = new ArrayList<>();
            float sum = 0;
            float average = 0;

            System.out.print("Enter array elements: ");
            while (true) {
                double value = scan.nextDouble();
                if (value != 0)
                    array.add(value);
                else break;
            }

            for (double j : array) {
                sum += j;
            }
            System.out.println("Sum = " + sum);

            average = (float)sum/array.size(); // calculation of average
            intAverage = Math.round(average); // rounding to a whole number
            System.out.println("Average = "+ intAverage + " ");
        }
    }
}
