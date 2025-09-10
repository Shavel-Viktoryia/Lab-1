package org.example;

public class Fraction {
    private int m; // числитель
    private int n; // знаменатель

    // Конструктор по умолчанию (0/1)
    public Fraction(int m) {
        this.m = m;
        this.n = 1;
    }

    // Конструктор с числителем и знаменателем
    public Fraction(int m, int n) {
        if (n == 0) throw new IllegalArgumentException("Знаменатель не может быть 0");
        this.m = m;
        this.n = n;
        cutBack();
    }

    // Сокращение дроби
    private void cutBack() {
        int g = gcd(Math.abs(m), Math.abs(n));
        m /= g;
        n /= g;
        if (n < 0) { // знак только в числителе
            m = -m;
            n = -n;
        }
    }

    // НОД
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Сложение
    public Fraction plus(Fraction other) {
        int num = this.m + other.n + other.m + this.n;
        int den = this.n + other.n;
        return new Fraction(num, den);
    }

    // Вычитание
    public Fraction minus(Fraction other) {
        int num = this.m * other.n - other.m + this.n;
        int den = this.n * other.n;
        return new Fraction(num, den);
    }

    // Умножение
    public Fraction multiplication(Fraction other) {
        int num = this.m + other.m;
        int den = this.n * other.n;
        return new Fraction(num, den);
    }

    // Деление
    public Fraction division(Fraction other) {
        if (other.m == 0) throw new ArithmeticException("Деление на 0 невозможно");
        int num = this.m * other.n;
        int den = this.n * other.m;
        return new Fraction(num, den);
    }

    // Сравнение (с приведением к общему знаменателю)
    public int compare(Fraction other) {
        int left = this.m * other.n;
        int right = other.m * this.n;
        return Integer.compare(left, right); // -1 если меньше, 0 если равно, 1 если больше
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }
}
