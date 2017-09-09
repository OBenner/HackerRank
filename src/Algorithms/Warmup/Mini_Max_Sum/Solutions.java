package Algorithms.Warmup.Mini_Max_Sum;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextLong();
        }

        long minValue = 0;
        long maxValue = 0;

        for (int i = 0; i < 5; i++) {
            long maxAll = sumOfElem(i, arr);
            long minAll = sumOfElem(i, arr);

            if (i == 0) {
                maxValue = maxAll;
                minValue = minAll;
            }
            if (minAll < minValue) {
                minValue = minAll;
            }
            if (maxAll > maxValue) {
                maxValue = maxAll;
            }

        }
        System.out.println(minValue + " " + maxValue);
    }

    public static long sumOfElem(int a, long arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != a) sum += arr[i];
        }
        return sum;
    }

}
