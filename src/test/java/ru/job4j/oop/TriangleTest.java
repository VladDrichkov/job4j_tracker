package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    void whenValidTriangleThenAreaCalculated() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result).isCloseTo(6.0, within(0.001));
    }

    @Test
    void whenPointsOnSameLineThenAreaMinusOne() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area()).isEqualTo(-1);
    }

    @Test
    void whenDegenerateTriangleThenAreaMinusOne() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        assertThat(triangle.area()).isEqualTo(-1);
    }
}

