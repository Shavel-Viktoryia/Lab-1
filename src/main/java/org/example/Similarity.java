package org.example;

import java.util.Scanner;

public class Similarity {
    // Координаты вершин треугольника
    private double x1, y1, x2, y2, x3, y3;

    // Метод задания координат вершин прямоугольного треугольника
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты 3 вершин прямоугольного треугольника:");

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

    // Метод вычисления длины стороны по двум точкам
    private double length(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }

    // Метод вычисления катетов (возвращает массив: [катет1, катет2, гипотенуза])
    public double[] catheter() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x3, y3, x1, y1);

        // Определю, какая сторона гипотенуза (самая длинная)
        double max = Math.max(a, Math.max(b, c));
        double cat1, cat2, hyp;

        if (max == a) {
            hyp = a; cat1 = b; cat2 = c;
        } else if (max == b) {
            hyp = b; cat1 = a; cat2 = c;
        } else {
            hyp = c; cat1 = a; cat2 = b;
        }

        return new double[]{cat1, cat2, hyp};
    }

    // Метод проверки подобия двух прямоугольных треугольников
    public static void comparison(Similarity t1, Similarity t2) {
        double[] c1 = t1.catheter();
        double[] c2 = t2.catheter();

        // Отношения сторон
        double ratio1 = c1[0] / c2[0];
        double ratio2 = c1[1] / c2[1];
        double ratio3 = c1[2] / c2[2];

        // Проверяю равенство отношений с небольшой погрешностью
        double eps = 1e-6;
        if (Math.abs(ratio1 -ratio2) < eps && Math.abs(ratio2 - ratio3) < eps) {
            System.out.println("Треугольники подобны.");
        } else {
            System.out.println("Треугольники не подобны.");
        }
    }
}
