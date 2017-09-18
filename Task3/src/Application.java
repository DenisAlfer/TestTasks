package com.company;
import java.util.Scanner;

public class Application {

    private static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        double a,b;
        String operator;

        while (true) {
            System.out.println("Введите число a:");
            a = str.nextDouble();

            System.out.println("Введите желаемое действи (+-*/):");
            operator = str.next();

            System.out.println("Введите число b:");
            b = str.nextDouble();

            if (operator.equals("*")) {
                System.out.println("= " + (a * b));
            }
            if (operator.equals("/")) {
                System.out.println("= " + (a / b));
            }
            if (operator.equals("+")) {
                System.out.println("= " + (a + b));
            }
            if (operator.equals("-")) {
                System.out.println("= " + (a - b));
            }
        }
    }
}