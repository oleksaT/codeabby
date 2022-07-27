package com.company;

import java.util.Scanner;

public class SumInLoop {
    public static void main(String[] args) {
/** Заполнение массива */
        Scanner in_array = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = in_array.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
		int array[] = new int[size]; // Создаём массив int размером в size
		System.out.println("Insert elements of array: ");

		/* Пройдёмся по всему массиву, заполняя его */
		for(int i = 0; i < size; i++) {
			array[i] = in_array.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
		}

		System.out.print("Inserted array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + array[i]); // Выводим на экран, полученный массив
		}
		System.out.println();
/** решение задачи ниже */
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Result = " + sum);
    }
}
