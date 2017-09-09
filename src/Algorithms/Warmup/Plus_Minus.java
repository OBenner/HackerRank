package Algorithms.Warmup;
import java.util.Scanner;

public class Plus_Minus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positiveCount = 0.0;
        double negativeCount = 0.0;
        double zeroCount = 0.0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < 0) {
                negativeCount++;
            } else if (arr[arr_i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }

        }
        System.out.printf("%.6f\n", positiveCount / n);
        System.out.printf("%.6f\n", negativeCount / n);
        System.out.printf("%.6f\n", zeroCount / n);

    }
}

