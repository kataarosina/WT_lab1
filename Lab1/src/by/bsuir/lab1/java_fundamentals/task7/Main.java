package by.bsuir.lab1.java_fundamentals.task7;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int N = in.nextInt();
        double source[] = new double[N];

        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            source[i] = in.nextDouble();
        }
        sort(source, N);
        printArray(source);
        in.close();
    }

    public static void sort(double[] matrix, int size) {
        for (int step = size / 2; step > 0; step /= 2) {
            for (int i = step; i < size; i++) {
                for (int j = i - step; j >= 0 && matrix[j] > matrix[j + step]; j -= step) {
                    double x = matrix[j];
                    matrix[j] = matrix[j + step];
                    matrix[j + step] = x;
                }
            }
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10.2f", array[i]);
        }
    }
}
