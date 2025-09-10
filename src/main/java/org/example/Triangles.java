package org.example;

import java.util.Scanner;

public class Triangles {
    private double x1, y1, x2, y2, x3, y3;

    // Метод ввода координат 3 вершин
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты 3 вершин треугольника:");

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

    // Метод вычисления длины стороны
    private double length(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }

    // Проверка, можно ли построить треугольник
    public boolean possibleBuildTriangle() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x3, y3, x1, x2);

        // Неравенство треугольника: сумма любых двух сторон > третьей
        boolean result = (a + b > c) && (a + c > b) && (b + c > a);

        if (result) {
            System.out.println("Из этих отрезков можно построить треугольник.");
        } else {
            System.out.println("Из этих отрезков нельзя построить треугольник.");
        }
        return result;
    }

    // Метод подсчёта площади по формуле Герона
    public void square() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x3, y3, x1, y1);

        if (possibleBuildTriangle()) {
            double p = (a + b + c) / 2; // полупериметр
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Площадь треугольника: %.2f\n", s);
        } else {
            System.out.println("Площадь вычислить нельзя, треугольник не существует.");
        }
    }
}
