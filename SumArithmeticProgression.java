package com.company;

import java.util.Scanner;

public class SumArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test-cases: ");
        int count = scanner.nextInt(); // количество сумм, которые надо вывести

        double sum = 0;
        System.out.println("Enter A D N:");
        for (int i = 0; i < count; i++) {
            double a = scanner.nextInt(); // первое число
            int d = scanner.nextInt(); // шаг
            int n = scanner.nextInt(); // количество итераций

            sum = ((2 * a + d * (n - 1)) / 2) * n;
            System.out.println(sum);
        }
        scanner.close();
    }
}
