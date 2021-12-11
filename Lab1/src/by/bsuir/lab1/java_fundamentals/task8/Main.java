package by.bsuir.lab1.java_fundamentals.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int N = in.nextInt();
        double sequenceA[] = new double[N];

        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            sequenceA[i] = in.nextDouble();
        }

        System.out.print("M: ");
        int M = in.nextInt();
        double sequenceB[] = new double[M];

        System.out.println("Matrix: ");
        for (int i = 0; i < M; i++) {
            sequenceB[i] = in.nextDouble();
        }

        System.out.println("Insert at indices up to: ");
        printArray(getIndexes(sequenceA, sequenceB));

        in.close();
    }

    public static int[] getIndexes(double[] sequenceA, double[] sequenceB) {
        int[] result = new int[sequenceB.length];

        int currentPosInSeqB = 0;
        for (int i = 0; i < sequenceA.length; i++) {
            for (int j = currentPosInSeqB; j < sequenceB.length; j++) {
                if (sequenceB[j] <= sequenceA[i]) {
                    result[j] = i + 1;
                } else {
                    currentPosInSeqB = j;
                    break;
                }
            }
        }
        if (currentPosInSeqB != sequenceB.length) {
            for (int j = currentPosInSeqB; j < sequenceB.length; j++) {
                result[j] = sequenceA.length + 1;
            }
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
