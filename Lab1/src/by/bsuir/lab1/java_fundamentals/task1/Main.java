package by.bsuir.lab1.java_fundamentals.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("y: ");
        double y = in.nextDouble();
        System.out.println(calculate(x, y));
        in.close();
    }

    public static double calculate(double x, double y) {
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x / (1 + Math.pow(x * y, 2))))) + x;
        return result;
    }
}