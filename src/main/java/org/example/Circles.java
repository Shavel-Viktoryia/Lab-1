package org.example;

import java.util.Scanner;

public class Circles {
    private double x, y, r;

    // Метод задания окружности
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату X центра: ");
        x = sc.nextDouble();
        System.out.print("Введите координату Y центра: ");
        y = sc.nextDouble();
        System.out.print("Введите радиус: ");
        r = sc.nextDouble();
    }

    // Геттеры
    public double getX() { return x; }
    public double getY() { return y; }
    public double getR() { return r; }

    // Метод вычисления расстояния между центрами двух окружностей
    public static double distance(Circles c1, Circles c2) {
        double dx = c1.x - c2.x;
        double dy = c1.y - c2.y;
        double d = Math.sqrt(dx * dx + dy * dy);
        System.out.printf("Расстояние между центрами: %.2f\n", d);
        return d;
    }

    // Метод проверки пересечения двух окружностей
    public static void intersection(Circles c1, Circles c2) {
        double d = distance(c1, c2);

        if (d > c1.r + c2.r) {
            System.out.println("Окружности не пересекаются (далеко друг от друга).");
        } else if (d < Math.abs(c1.r - c2.r)) {
            System.out.println("Одна окружность лежит внутри другой, без пересечений.");
        } else {
            System.out.println("Окружности пересекаются.");
        }
    }

    // Метод, выводящий наибольшую площадь
    public static void maxSquare(Circles c1, Circles c2) {
        double s1 = Math.PI * c1.r * c1.r;
        double s2 = Math.PI * c2.r * c2.r;

        if (s1 > s2) {
            System.out.printf("Наибольшая площадь: %.2f (первая окружность)\n", s1);
        } else if (s2 > s1) {
            System.out.printf("Наибольшая площадь: %.2f (вторая окружность)\n", s2);
        } else {
            System.out.printf("Обе окружности имеют одинаковую площадь: %.2f\n", s1);
        }
    }
}
