package org.example;

import java.util.Scanner;

public class Circle {
    private double x, y, r;

    public void enter_parameters() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите X центра: ");
        x = sc.nextDouble();
        System.out.print("Введите Y центра: ");
        y = sc.nextDouble();
        System.out.print("Введите радиус: ");
        r = sc.nextDouble();
    }

    public double square() {
        double s = Math.PI * r * r;
        System.out.printf("Площадь круга: %.2f\n", s);
        return s;
    }

    public double length() {
        double d = 2 * Math.PI * r;
        System.out.printf("Длина окружности: %.2f\n", d);
        return d;
    }

    public void comparison() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для сравнения: ");
        double number = sc.nextDouble();
        double s = square();

        if (s > number) System.out.println("Площадь больше числа.");
        else if (s < number) System.out.println("Площадь меньше числа.");
        else System.out.println("Площадь равна числу.");
    }

    public Double squareAsDouble() {
        return square();
    }
}
