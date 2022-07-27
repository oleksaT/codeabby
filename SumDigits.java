package com.company;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test-cases: ");
        int count = scanner.nextInt(); // count of sum what need to enter
        int sum = 0;
        for(int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println();

            sum = a * b + c; // calculation of the amount
            System.out.print(sum + " ");

            int sum_digits = 0;
            while (sum != 0) {
                sum_digits += (sum % 10); // left last digit from sum and add to sum_digits
                sum /= 10; // divide sum on 10 and goes tp next iteration
            }
            System.out.print(sum_digits);
        }
        scanner.close();
    }
}
