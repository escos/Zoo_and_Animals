package ru.levelp.example.circle;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random gen = new Random();
    public static void main(String[] args) {
        // Ввод исходных данных
        double r = gen.nextDouble();
        double x = gen.nextDouble();
        double y = gen.nextDouble();
        Circle t = new Circle(r, x, y);
        System.out.printf("Начальные координаты центра окружности: x = %.3f, y = %.3f\n", t.x, t.y);
        System.out.printf("Исходный радиус = %.3f\n", t.radius);
        // Двигаем центр окружности
        System.out.println("Введите величины изменения координат(необходимо ввести два числа вещественного типа):");
        double dx = sc.nextDouble();
        double dy = sc.nextDouble();
        t.move(dx, dy);
        System.out.printf("Новые координаты центра: х = %.3f, y = %.3f\n", t.x, t.y);
        // Изменяем радиус окружности в n раз
        System.out.println("Введите во сколько раз изменить радиуса круга:");
        double value = sc.nextDouble();
        t.multiZoom(value);
        System.out.printf("Измененный радиус = %.3f\n", t.radius);
        // Изменяем радиус круга на n
        System.out.println("Введите величину изменения радиуса круга:");
        double value1 = sc.nextDouble();
        t.changedZoom(value1);
        System.out.printf("Измененный радиус = %.3f\n", t.radius);
        double diametr = t.calculateDiametr(); // вычисляем диаметр
        double length = t.circleLength();      // вычисляем длину окружности
        double square = t.circleSquare();      // вычисляем площади круга
        String rd = t.toString();
        // Проверяем, находится ли заданная точка внутри круга
        System.out.println("Введите координаты заданной точки (необходимо ввести два числа вещественного типа):");
        double xpoint = sc.nextDouble();
        double ypoint = sc.nextDouble();
        t.findPoint(xpoint, ypoint);
        // вывод всех рассчитанных данных
        System.out.printf("Диаметр окружности = %.3f\n", diametr);
        System.out.printf("Длина окружности = %.3f\n", length);
        System.out.printf("Площадь круга = %.3f\n", square);
        System.out.println("Вывод с использованием метода ToString");
        System.out.println(rd);
    }
}