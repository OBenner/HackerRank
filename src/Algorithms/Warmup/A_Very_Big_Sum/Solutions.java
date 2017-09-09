package Algorithms.Warmup.A_Very_Big_Sum;

import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

    static long aVeryBigSum(int n, long[] ar) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += ar[i];
        }
        return res;
    }
}