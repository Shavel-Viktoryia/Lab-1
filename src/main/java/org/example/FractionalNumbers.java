package org.example;

import java.util.Scanner;

public class FractionalNumbers {
    private double[] numbers;

    // Метод ввода чисел
    public void enter() {
        Scanner sc = new Scanner(System.in);
        numbers = new double[10];
        System.out.println("Введите 10 чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }
    }

    // Метод: дробная часть числа
    public double franctionalPart(Double num) {
        return num - Math.floor(num);
    }

    // Метод: сумма каждого второго введённого числа
    public void sumOfEachTheSecond() {
        double sum = 0;
        for (int i = 1; i < numbers.length; i += 2) { // беру 2-е, 4-е, 6-е и т.д.
            sum += numbers[i];
        }
        System.out.println("Сумма каждого второго числа: " + sum);
    }

    // Метод: привести число к Float
    public void toFloat(double num) {
        Float f = (float) num;
        System.out.println(num + " -> " + f);
    }

    // Метод: поиск числа среди введённых
    public void search(double target) {
        boolean found = false;
        for (double num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + target + " найдено среди введённых.");
        } else {
            System.out.println("Число " + target + " не найдено среди введённых.");
        }
    }
}
