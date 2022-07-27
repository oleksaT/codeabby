package com.company;

import java.util.Scanner;

public class WeightedSumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test-cases: ");
        int count = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < count; i++) {
            int digit = scanner.nextInt();

            for(int n = 1; n < 10; n++) {
                sum = sum + (digit % 10) * n;
                digit /= 10;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
