package by.bsuir.lab1.java_fundamentals.task4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int N = in.nextInt();
        int source[] = new int[N];

        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            source[i] = in.nextInt();
        }
        findSimplifyNumbers(source);
        in.close();
    }

    public static void findSimplifyNumbers(int[] source) {
        System.out.println("Simplify number index:");
        for (int i = 0; i < source.length; i++) {
            if (isPrime(source[i])) {
                System.out.println(i + 1);
            }
        }
    }

    public static boolean isPrime(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
