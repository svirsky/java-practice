package com.rakovets.java.practice;

public class LamdaCalculate {
    public static void main(String[] args) {
        Operationable operation1, operation2, operation3, operation4;
        operation1 = (x, y) -> x + y;
        operation2 = (x, y) -> x - y;
        operation3 = (x, y) -> x / y;
        operation4 = (x, y) -> x * y;

        int result = operation1.calculate(10, 20);
        System.out.println(result); //30
    }
}

interface Operationable {
    int calculate(int x, int y);
}