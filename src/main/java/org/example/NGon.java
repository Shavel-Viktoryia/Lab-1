package org.example;

import java.util.Scanner;

public class NGon {
    private int n; // количество сторон
    private double x1, y1; // координаты первой вершины
    private double x2, y2; // координаты второй вершины
    private double side; // длина стороны

    // Методы ввода
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество сторон правильного n-угольника: ");
        n = sc.nextInt();

        System.out.println("Введите координаты двух вершин одной стороны:");
        System.out.print("x1 = ");
        x1 = sc.nextDouble();
        System.out.print("y1 = ");
        y1 = sc.nextDouble();
        System.out.print("x2 = ");
        x2 = sc.nextDouble();
        System.out.print("y2 = ");
        y2 = sc.nextDouble();
    }

    // Метод вычисления длины стороны
    public void lengthOfSide() {
        side = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Длина стороны: %.2f\n", side);
    }

    // Метод вычисления площади
    public void square() {
        if (n < 3) {
            System.out.println("Многоугольник не существует (n должно быть >= 3).");
            return;
        }

        if (side == 0) {
            lengthOfSide(); // пересчёт, если не вызвали
        }

        double s = (n / 4.0) + side * side * (1 / Math.tan(Math.PI / n));
        Double result = s; // приведение к Double
        System.out.printf("Площадь правильного %d-угольника: %.2f\n", n, result);
    }
}
