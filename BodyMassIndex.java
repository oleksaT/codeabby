package com.company;

import java.util.Scanner;

public class BodyMassIndex {
    public static String bmiCategory (double weight, double height) {
        // calculate BMI
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            return "under";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            return "normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            return "over";
        } else if (bmi >= 30.0) {
            return "obese";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count of results: ");
        int count = scan.nextInt();

        double weightInKg = 0.0;
        double heightInMeters = 0.0;
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter weight in Kg: ");
            weightInKg = scan.nextDouble();
            System.out.print("Enter height in Meters: ");
            heightInMeters = scan.nextDouble();

            result[i] = bmiCategory(weightInKg,heightInMeters);
        }

        System.out.print("Result: [");
        for (int j = 0; j < count; j++) {
            System.out.print(" " + result[j]); // Enter result array
        }
        System.out.println(" ]");

        scan.close();
    }
}
