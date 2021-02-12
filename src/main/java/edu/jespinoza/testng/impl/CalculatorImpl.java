package edu.jespinoza.testng.impl;

import edu.jespinoza.testng.Calculator;

public class CalculatorImpl implements Calculator {
    private static CalculatorImpl ourInstance;

    public static CalculatorImpl getInstance() {
        if (ourInstance == null) {
            ourInstance = new CalculatorImpl();
        }
        return ourInstance;
    }

    private CalculatorImpl() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int squaresum(int a, int b) {
        return a * a + b * b;
    }
}
