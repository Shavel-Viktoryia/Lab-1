package org.example;

import java.util.*;

public class Comparison {
    private Scanner sc = new Scanner(System.in);

    // Метод ввода числа пользователем и преобразования в Double
    public Double enterNumber() {
        System.out.print("Введите число: ");
        return sc.nextDouble();
    }

    // Метод попарного сравнения 2 чисел
    public double compareTwoNumbers() {
        Double a = enterNumber();
        Double b = enterNumber();

        double max = Math.max(a, b);
        double fractionalPart = max - Math.floor(max);

        System.out.printf("Максимальное число: %.2f, дробная часть: %.2f\n", max, fractionalPart);
        return fractionalPart;
    }

    // Метод: ввод 10 чисел и вывод 5 максимальных дробных частей
    public void maxFiveFractionalNumbers() {
        double[] numbers = new double[10];
        List<Double> fractionalParts = new ArrayList<>();

        System.out.println("Введите 10 чисел типа Double:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
            double fraction = numbers[i] - Math.floor(numbers[i]);
            fractionalParts.add(fraction);
        }

        // Сортировка по убыванию
        fractionalParts.sort(Collections.reverseOrder());

        // Вывод 5 максимальных
        double sum = 0;
        System.out.println("5 максимальных дробных частей:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f\n", fractionalParts.get(i));
            sum += fractionalParts.get(i);
        }

        System.out.printf("Сумма этих дробных частей: %.2f\n", sum);
    }
}
