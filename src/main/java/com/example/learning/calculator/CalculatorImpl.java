package com.example.learning.calculator;

public class CalculatorImpl implements Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
    public int modulo(int a, int b) {
        return a % b;
    }
}
