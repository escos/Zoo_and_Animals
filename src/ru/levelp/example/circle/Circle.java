package ru.levelp.example.circle;

public class Circle {
    double x;
    double y;
    double radius;

    Circle(double radius, double x, double y) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус меньше 0");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x = x + dx;
        y += dy;
    }

    public void multiZoom(double factor) {
        radius = factor * radius;
    }

    public void changedZoom(double delta) {
        radius += delta;
    }

    public void findPoint(double x1, double y1) {
        System.out.printf("Координаты заданной точки:x = %.3f, y = %.3f\n", x1, y1);
        double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
        if (distance > radius)
            System.out.println("Точка находится за пределами круга");
        else if (distance == radius)
            System.out.println("Точка находится на окружности");
        else
            System.out.println("Точка находится внутри круга");
    }

    public double circleLength() {
        double length = 2 * Math.PI * radius;
        return length;
    }

    public double circleSquare() {
        double square = Math.PI * Math.pow(radius, 2);
        return square;
    }

    public double calculateDiametr() {
        double diametr = 2 * radius;
        return diametr;
    }

    public String toString() {
        return "Обновленный радиус = " + this.radius + " , новые координаты центра: x = " + x + ", y = " + y;
    }
}
