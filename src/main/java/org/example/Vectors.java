package org.example;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    private double[] coords;

    // Конструктор: по массиву
    public Vectors(double[] coords) {
        this.coords = Arrays.copyOf(coords, coords.length);
    }

    // Конструктор: нулевой вектор размерности n
    public Vectors(int n) {
        this.coords = new double[n];
    }

    public int getSize() {
        return coords.length;
    }

    // Сложение
    public Vectors plus(Vectors other) {
        checkSize(other);
        double[] res = new double[getSize()];
        for (int i = 0; i < getSize(); i++) {
            res[i] = this.coords[i] + other.coords[i];
        }
        return new Vectors(res);
    }

    // Вычитание
    public Vectors minus(Vectors other) {
        checkSize(other);
        double[] res = new double[getSize()];
        for (int i = 0; i < getSize(); i++) {
            res[i] = this.coords[i] - other.coords[i];
        }
        return new Vectors(res);
    }

    // Скалярное произведение
    public double multiplication(Vectors other) {
        checkSize(other);
        double res = 0;
        for (int i = 0; i < getSize(); i++) {
            res += this.coords[i] * other.coords[i];
        }
        return res;
    }

    // Инкремент
    public void inc() {
        for (int i = 0; i < getSize(); i++) {
            coords[i]++;
        }
    }

    // Декремент
    public void dec() {
        for (int i = 0; i < getSize(); i++) {
            coords[i]--;
        }
    }

    // Индексирование
    public double get(int index) {
        return coords[index];
    }

    // Модель вектора
    private double length() {
        double sum = 0;
        for (double v : coords) sum += v * v;
        return Math.sqrt(sum);
    }

    // Угол между векторами
    public double angle(Vectors other) {
        checkSize(other);
        double scalar = multiplication(other);
        double len1 = this.length();
        double len2 = other.length();
        return Math.acos(scalar / (len1 * len2)); // в радианах
    }

    private void checkSize(Vectors other) {
        if (this.getSize() != other.getSize())
            throw new IllegalArgumentException("Размерности векторов должны совпадать");
    }

    @Override
    public String toString() {
        return Arrays.toString(coords);
    }
}
