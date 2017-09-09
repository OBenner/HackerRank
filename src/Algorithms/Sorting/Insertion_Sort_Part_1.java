package Algorithms.Sorting;

import java.util.Scanner;

public class Insertion_Sort_Part_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void insertIntoSorted(int[] ar) {
        int n = ar.length;
        int v = ar[n - 1];
        int lastIndex = n - 1;
        boolean flag = true;
        while (flag && lastIndex >= 0) {
            if (lastIndex == 0) {
                ar[lastIndex] = v;
                flag = false;
            } else if (ar[lastIndex - 1] > v) {
                ar[lastIndex] = ar[lastIndex - 1];
                lastIndex = lastIndex - 1;

            } else if (ar[lastIndex - 1] < v) {
                ar[lastIndex] = v;
                flag = false;
            }
            printArray(ar);
        }
    }

}
