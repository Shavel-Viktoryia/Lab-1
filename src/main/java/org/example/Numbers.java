package org.example;

import java.util.Scanner;

public class Numbers {
    private double[] numbers = new double[10];

    // Метод считывания 10 чисел
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }
    }

    // Метод, возвращающий только те значения, которые больше заданного и кратны 3
    public void filtr(double threshold) {
        double sum = 0;
        System.out.println("Числа больше " + threshold + " и кратные 3:");
        for (double num : numbers) {
            if (num > threshold && num % 3 == 0) {
                System.out.println(num);
                sum += num;
            }
        }
        System.out.println("Сумма таких чисел: " + sum);
    }

    // Метод, приводящий числа к Integer
    public void toInteger() {
        System.out.println("Числа, приведённые к Integer:");
        for (double num : numbers) {
            int intValue = (int) num;
            System.out.println(num + " -> " + intValue);
        }
    }

    // Метод, находящий максимальное число
    public void maxValue() {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}
