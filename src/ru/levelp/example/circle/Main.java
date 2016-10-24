package ru.levelp.example.circle;

public class Main {
    public static void main(String[] args) {
        Circle t = new Circle(1, 2, 5);

        System.out.printf("Начальные координаты центра окружности: x = %.3f, y = %.3f\n", t.x, t.y);
        System.out.printf("Исходный радиус = %.3f\n", t.radius);
        // Двигаем центра окружности
        t.move(3, 3);
        // Изменяем радиус окружности
        t.zoom(4);
        System.out.printf("Измененный радиус = %.3f\n", t.radius);
        double diametr = t.calculateDiametr(); // вычисляем диаметр
        double length = t.circleLength();      // вычисляем длину окружности
        double square = t.circleSquare();      // вычисляем площади круга
        String rd = t.toString();
        // Проверяем, находится ли заданная точка внутри круга
        t.findPoint(0, 1);
        // вывод всех рассчитанных данных
        System.out.printf("Новые координаты центра: х = %.3f, y = %.3f\n", t.x, t.y);
        System.out.printf("Диаметр окружности = %.3f\n", diametr);
        System.out.printf("Длина окружности = %.3f\n", length);
        System.out.printf("Площадь круга = %.3f\n", square);
        System.out.println(rd);
    }
}
