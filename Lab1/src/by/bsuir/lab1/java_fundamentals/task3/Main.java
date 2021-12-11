package by.bsuir.lab1.java_fundamentals.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("h: ");
        double h = in.nextDouble();
        double result[][] = calculate(a, b, h);
        for (int i = 0; i < result[0].length; i++) {
            System.out.printf("x = %7.3f   y = %7.3f\n", result[0][i], result[1][i]);
        }
        in.close();
    }

    public static double[][] calculate(double a, double b, double h) {
        double[][] result = new double[2][(int) ((b - a) / h)];
        double x = a;
        int i = 0;
        while (b - x > 1e-5) {
            result[0][i] = x;
            result[1][i++] = Math.tan(x);
            x += h;
        }
        return result;
    }
}
