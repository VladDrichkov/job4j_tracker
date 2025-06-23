package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point aPoint, Point bPoint, Point cPoint) {
        this.first = aPoint;
        this.second = bPoint;
        this.third = cPoint;
    }

    private double semiPerimeter(double ab, double ac, double bc) {
        return 0.5 * (ab + ac + bc);
    }

    private boolean exist(double ab, double ac, double bc) {
        final double EPS = 1e-10;
        return ab + ac - bc > EPS && ab + bc - ac > EPS && ac + bc - ab > EPS;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = this.semiPerimeter(ab, ac, bc);
            result = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return result;
    }
}
