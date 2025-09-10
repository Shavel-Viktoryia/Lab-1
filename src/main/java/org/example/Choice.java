package org.example;

import java.util.Random;

public class Choice {
    private double number; // поле для хранения случайного числа

    // Метод, задающий число случайным образом и переводящий его в Double
    public Double randomNumber() {
        Random random = new Random();
        number = random.nextDouble() * 100; // случайное число от 0 до 100
        System.out.println("Случайное число: " + number);
        return number; // Double (авто-боксинг)
    }

    // Метод, задающий 10 случайных чисел, выводящий макс, мин, сумму, косинус суммы
    // и целую часть суммы
    public void randomTenNumber() {
        double[] arr = new double[10];
        double sum = 0;

        System.out.println("10 случайных чисел:");
        for (int i = 0; i < 10; i++) {
            arr[i] = randomNumber(); // вызываю предыдущий метод
            sum += arr[i];
        }

        double max = arr[0], min = arr[0];
        for (double n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Косинус суммы: " + Math.cos(sum));
        System.out.println("Целая часть суммы: " + (int) sum);
    }

    // Метод, проверяющий, является ли заданное случайное число кратным 2 или 3
    public void multiplicity() {
        // Если число дробное, проверим на кратность целой части
        int n = (int) number;
        if (n % 2 == 0 || n % 3 ==0) {
            System.out.println(n + " кратно 2 или 3");
        } else {
            System.out.println(n + "не кратно 2 или 3");
        }
    }
}
