package by.bsuir.lab1.java_fundamentals.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int N = in.nextInt();
        int source[] = new int[N];

        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            source[i] = in.nextInt();
        }
        System.out.print("K = ");
        System.out.println(countNumbers(source));
        in.close();
    }

    public static int countNumbers(int[] numbers) {
        int result = 0, max = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= max) {
                result++;
            } else {
                max = numbers[i + 1];
            }
        }
        return result;
    }
}
