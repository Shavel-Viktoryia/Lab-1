package org.example;

import java.util.Arrays;

public class VectorN {
    private double[] coords;

    // Конструктор 1: по размерности (заполняется нулями)
    public VectorN(int n) {
        coords = new double[n];
    }

    // Конструктор 2: по массиву
    public VectorN(double[] values) {
        coords = Arrays.copyOf(values, values.length);
    }

    // Конструктор 3: копирование
    public VectorN(VectorN other) {
        coords = Arrays.copyOf(other.coords, other.coords.length);
    }

    // Получить размерность
    public int size() {
        return coords.length;
    }

    // Вычисление модуля вектора
    public double magnitude() {
        double sum = 0;
        for (double v : coords) {
            sum += v * v;
        }
        return Math.sqrt(sum);
    }

    // Скалярное произведение
    public double dot(VectorN other) {
        checkSize(other);
        double sum = 0;
        for (int i = 0; i < coords.length; i++) {
            sum += coords[i] * other.coords[i];
        }
        return sum;
    }

    // Сложение
    public VectorN add(VectorN other) {
        checkSize(other);
        double[] res = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            res[i] = coords[i] + other.coords[i];
        }
        return new VectorN(res);
    }

    // Вычитание
    public VectorN subtract(VectorN other) {
        checkSize(other);
        double[] res = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            res[i] = coords[i] - other.coords[i];
        }
        return new VectorN(res);
    }

    // Умножение на константу
    public VectorN multiply(double k) {
        double[] res = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            res[i] = coords[i] * k;
        }
        return new VectorN(res);
    }

    // Проверка на коллинеарность
    public boolean isCollinear(VectorN other) {
        checkSize(other);
        Double ratio = null;
        for (int i = 0; i < coords.length; i++) {
            if (other.coords[i] != 0) {
                double current = coords[i] / other.coords[i];
                if (ratio == null) {
                    ratio = current;
                } else if (Math.abs(current - ratio) > 1e-9) {
                    return false;
                }
            } else if (coords[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Проверка на ортогональность
    public boolean isOrthogonal(VectorN other) {
        return Math.abs(this.dot(other)) < 1e-9;
    }

    // Проверка размерности
    private void checkSize(VectorN other) {
        if (this.size() != other.size()) {
            throw new IllegalArgumentException("Векторы разной размерности!");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(coords);
    }
}
