package org.example;

import java.util.Scanner;

public class QuadraticEquations {
    private double a, b, c;
    private Double d; // дискриминант
    private Double x1, x2; // корни

    // Метод задания коэффициентов
    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        a = sc.nextDouble();
        System.out.print("Введите коэффициент b: ");
        b = sc.nextDouble();
        System.out.print("Введите коэффициент c: ");
        c = sc.nextDouble();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Все коэффициенты равны 0 - уравнение не имеет смысла.");
        }
    }

    // Метод вычисления дискриминанта
    public Double discriminant() {
        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Дискриминант отрицательный: D = " + d);
        } else {
            System.out.println("Дискриминант: " + d);
        }
        return d;
    }

    // Метод вычисления корней
    public void roots() {
        if (d == null) discriminant();

        if (d < 0) {
            System.out.println("Корней нет (D < 0).");
            return;
        }

        if (a == 0) {
            if (b != 0) {
                x1 = -c / b;
                System.out.printf("Это линейное уравнение. Корень: x = %.2f\n", x1);
            } else {
                System.out.println("Некорректное уравнение.");
            }
            return;
        }

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.printf("Корни уравнения: x1 = %.2f, x2 = %.2f\n", x1, x2);
    }

    // Метод разложения по формуле
    public void decomposition() {
        if (x1 != null && x2 != null) {
            roots();
        }

        if (x1 != null && x2 != null) {
            System.out.printf("Разложение: %.2fx^2 + %.2fx + %.2f = %.2f(x - %.2f)(x - %.2f)\n",
                    a, b, c, a, x1, x2);
        } else {
            System.out.println("Разложение невозможно (нет двух вещественных корней).");
        }
    }
}
