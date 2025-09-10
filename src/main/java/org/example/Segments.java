package org.example;

import java.util.Scanner;

public class Segments {
    private double x1, y1, x2, y2; // координаты первого отрезка
    private double x3, y3, x4, y4; // координаты второго отрезка

    // Метод ввода координат двух отрезков
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первого отрезка:");
        System.out.print("x1 = ");
        x1 = sc.nextDouble();
        System.out.print("y1 = ");
        y1 = sc.nextDouble();
        System.out.print("x2 = ");
        x2 = sc.nextDouble();
        System.out.print("y2 = ");
        y2 = sc.nextDouble();

        System.out.println("Введите координаты второго отрезка:");
        System.out.print("x3 = ");
        x3 = sc.nextDouble();
        System.out.print("y3 = ");
        y3 = sc.nextDouble();
        System.out.print("x4 = ");
        x4 = sc.nextDouble();
        System.out.print("y4 = ");
        y4 = sc.nextDouble();
    }

    // Метод подсчёта длины первого отрезка
    public double length1() {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Длина первого отрезка: %.2f\n", d);
        return d;
    }

    // Метод подсчёта длины второго отрезка
    public double length2() {
        double d = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.printf("Длина второго отрезка: %.2f\n", d);
        return d;
    }

    // Метод сравнения длин отрезков
    public void comparison() {
        double d1 = length1();
        double d2 = length2();

        if (d1 > d2) {
            System.out.println("Первый отрезок длиннее второго.");
        } else if (d1 < d2) {
            System.out.println("Второй отрезок длиннее первого.");
        } else {
            System.out.println("Отрезки равной длины.");
        }
    }

    // Метод, в котором сумма длин отрезков приводится к типу String
    public String summaAsString() {
        double sum = length1() + length2();
        String result = String.valueOf(sum);
        System.out.println("Сумма длин отрезков (как строка): " + result);
        return result;
    }
}
