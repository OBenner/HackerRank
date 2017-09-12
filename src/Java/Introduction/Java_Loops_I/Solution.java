package Java.Introduction.Java_Loops_I;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res = N * i;
            System.out.println(N + " x " + i + " = " + res);
        }
    }

}
