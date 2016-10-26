package ru.levelp.example.circle;

public class Circle {
    double x;
    double y;
    double radius;
    final static double E = 0.001;

    Circle(double radius, double x, double y) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус меньше 0");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус меньше 0");
        }
        this.radius = radius;
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

    public boolean pointIntoCircle(double x1, double y1) {
        System.out.printf("Координаты заданной точки:x = %.3f, y = %.3f\n", x1, y1);
        double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
        if (distance * (1 - E) > radius)
            return false;
        else return true;
    }

    public double circleLength() {
        return 2 * Math.PI * radius;
    }

    public double circleSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateDiametr() {
        return 2 * radius;
    }

    public String toString() {
        return "Радиус окружности= " + this.radius + " , координаты центра: x = " + x + ", y = " + y;
    }
}
