package org.example;

import java.util.Scanner;

public class RightAngledTriangle {
    private double x1, y1, x2, y2, x3, y3;

    // Ввод координат 3 вершин треугольника
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты треугольника:");

        System.out.print("x1 = ");
        x1 = sc.nextDouble();
        System.out.print("y1 = ");
        y1 = sc.nextDouble();

        System.out.print("x2 = ");
        x2 = sc.nextDouble();
        System.out.print("y2 = ");
        y2 = sc.nextDouble();

        System.out.print("x3 = ");
        x3 = sc.nextDouble();
        System.out.print("y3 = ");
        y3 = sc.nextDouble();
    }

    // Длина стороны по двум точкам
    private double length(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }

    // Проверка, прямоугольный ли треугольник
    public boolean rightAngled() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x3, y3, x1, y1);

        // Теорема Пифагора: квадрат гипотенузы = сумме квадратов катетов
        double eps = 1e-6;
        boolean result =
                Math.abs(a * a + b * b - c * c) < eps ||
                Math.abs(a * a + c * c - b * b) < eps ||
                Math.abs(b * b + c * c - a * a) < eps;

        if (result) {
            System.out.println("Треугольник прямоугольный.");
        } else {
            System.out.println("Треугольник НЕ прямоугольный.");
        }

        return result;
    }

    // Площадь треугольника (если он прямоугольный)
    public void square() {
        if (rightAngled()) {
            double a = length(x1, y1, x2, y2);
            double b = length(x2, y2, x3, y3);
            double c = length(x3, y3, x1, y1);

            // Нахожу катеты (две меньшие стороны)
            double[] sides = {a, b, c};
            java.util.Arrays.sort(sides); // [катет1, катет2, гипотенуза]

            double s = (sides[0] * sides[1]) / 2;
            System.out.printf("Площадь прямоугольного треугольника: %.2f\n", s);
        } else {
            System.out.println("Площадь нельзя вычислить - треугольник не прямоугольный.");
        }
    }

    // Периметр треугольника
    public void perimetr() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x3, y3, x1, y1);

        double p = a + b + c;
        System.out.printf("Периметр треугольника: %.2f\n", p);
    }
}
