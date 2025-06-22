package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public double divide(int a) {
        return a / x;
    }

    public double sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        result = calc.multiply(10);
        System.out.println(result);
        result = Calculator.minus(10);
        System.out.println(result);
        double resultFloatPoint = calc.divide(10);
        System.out.println(resultFloatPoint);
        resultFloatPoint = calc.sumAllOperation(10);
        System.out.println(resultFloatPoint);
    }
}
