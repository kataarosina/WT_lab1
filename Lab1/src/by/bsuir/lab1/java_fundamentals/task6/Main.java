package by.bsuir.lab1.java_fundamentals.task6;

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
        printMatrix(createMatrix(source, N));
        in.close();
    }

    public static double[][] createMatrix(double[] matrix, int size) {
        double[][] result = new double[size][size];
        for (int i = 0; i < size; i++) {
            int index = i + 1;
            result[i][0] = matrix[i];
            for (int j = 1; j < size; j++) {
                if (index == size)
                    index = 0;
                result[i][j] = matrix[index];
                index++;
            }
        }
        return result;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%10.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
