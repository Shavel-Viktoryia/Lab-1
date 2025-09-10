package org.example;
import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nВыберите задание:");
            System.out.println("1 - Окружность");
            System.out.println("2 - Случайные 10 чисел");
            System.out.println("3 - Отрезки");
            System.out.println("4 - Треугольники");
            System.out.println("5 - Подобие");
            System.out.println("6 - Прямоугольный треугольник");
            System.out.println("7 - Окружности");
            System.out.println("8 - Числа");
            System.out.println("9 - N-угольник");
            System.out.println("10 - Квадратное уравнение");
            System.out.println("11 - Дробные числа");
            System.out.println("12 - Дробь");
            System.out.println("13 - Векторы");
            System.out.println("14 - Сравнение");
            System.out.println("15 - Вектор размерности N");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    Circle c = new Circle();
                    c.enter_parameters();
                    c.square();
                    c.length();
                    c.comparison();
                    System.out.println("Площадь как Double: " + c.squareAsDouble());
                    break;
                case 2:
                    Choice ch = new Choice();
                    // Метод случайного числа
                    ch.randomNumber();
                    // Метод 10 случайных чисел
                    ch.randomTenNumber();
                    // Проверка кратности 2 или 3
                    ch.multiplicity();
                    break;
                case 3:
                    Segments s = new Segments();
                    s.enter();
                    s.length1();
                    s.length2();
                    s.comparison();
                    s.summaAsString();
                case 4:
                    Triangles t = new Triangles();
                    t.enter();
                    t.possibleBuildTriangle();
                    t.square();
                case 5:
                    Similarity t1 = new Similarity();
                    System.out.println("Первый треугольник:");
                    t1.enter();

                    Similarity t2 = new Similarity();
                    System.out.println("Второй треугольник:");
                    t2.enter();

                    Similarity.comparison(t1, t2);
                case 6:
                    RightAngledTriangle r = new RightAngledTriangle();
                    r.enter();
                    r.rightAngled();
                    r.square();
                    r.perimetr();
                case 7:
                    Circles c1 = new Circles();
                    System.out.println("Первая окружность:");
                    c1.enter();

                    Circles c2 = new Circles();
                    System.out.println("Вторая окружность:");
                    c2.enter();

                    Circles.distance(c1, c2);
                    Circles.intersection(c1, c2);
                    Circles.maxSquare(c1, c2);
                case 8:
                    Numbers num = new Numbers();
                    num.enter();
                    num.filtr(5); // например, проверка для порога = 5
                    num.toInteger();
                    num.maxValue();
                case  9:
                    NGon n = new NGon();
                    n.enter();
                    n.lengthOfSide();
                    n.square();
                case 10:
                    QuadraticEquations qe = new QuadraticEquations();
                    qe.enter();
                    qe.discriminant();
                    qe.roots();
                    qe.decomposition();
                case 11:
                    FractionalNumbers fn = new FractionalNumbers();
                    fn.enter();
                    System.out.println("Дробная часть 12.75 = " + fn.franctionalPart(12.75));
                    fn.sumOfEachTheSecond();
                    fn.toFloat(7.89);
                    fn.search(5.0);
                case 12:
                    Fraction f1 = new Fraction(1, 2); // 1/2
                    Fraction f2 = new Fraction(3, 4); // 3/4

                    System.out.println("f1 = " + f1);
                    System.out.println("f2 = " + f2);
                    System.out.println("Сумма: " + f1.plus(f2));
                    System.out.println("Разность: " + f1.minus(f2));
                    System.out.println("Произведение: " + f1.multiplication(f2));
                    System.out.println("Деление: " + f1.division(f2));

                    int cmp = f1.compare(f2);
                    if (cmp < 0) System.out.println(f1 + " < " + f2);
                    else if (cmp > 0) System.out.println(f1 + " > " + f2);
                    else System.out.println(f1 + " = " + f2);
                case 13:
                    Vectors v1 = new Vectors(new double[]{1, 2, 3});
                    Vectors v2 = new Vectors(new double[]{4, 5, 6});

                    System.out.println("v1 = " + v1);
                    System.out.println("v2 = " + v2);

                    System.out.println("Сумма: " + v1.plus(v2));
                    System.out.println("Разность: " + v1.minus(v2));
                    System.out.println("Скалярное произведение: " + v1.multiplication(v2));

                    v1.inc();
                    System.out.println("v1 после инкремента: " + v1);
                    v2.dec();
                    System.out.println("v2 после декремента: " + v2);

                    System.out.println("Элемент v1[1] = " + v1.get(1));
                    System.out.printf("Угол между v1 и v2 = %.2f рад\n", v1.angle(v2));
                case 14:
                    Comparison com = new Comparison();
                    // Сравнение двух чисел
                    com.compareTwoNumbers();
                    // Работа с 10 числами
                    com.maxFiveFractionalNumbers();
                case 15:
                    VectorN vN1 = new VectorN(new double[]{1, 2, 3});
                    VectorN vN2 = new VectorN(new double[]{2, 4, 6});
                    VectorN vN3 = new VectorN(new double[]{-2, 1, 0});

                    System.out.println("v1 = " + vN1);
                    System.out.println("v2 = " + vN2);

                    System.out.println("Модуль v1 = " + vN1.magnitude());
                    System.out.println("Скалярное произведение v1*v2 = " + vN1.dot(vN2));
                    System.out.println("Сумма v1+v2 = " + vN1.add(vN2));
                    System.out.println("Разность v1-v3 = " + vN1.subtract(vN3));
                    System.out.println("v1 * 3 = " + vN1.multiply(3));

                    System.out.println("v1 и v2 коллинеарны? " + vN1.isCollinear(vN2));
                    System.out.println("v1 и v3 ортогональны? " + vN1.isOrthogonal(vN3));
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        } while (choice != 0);

        sc.close();
    }
}