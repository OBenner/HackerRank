package Algorithms.Search.Sherlock_and_Array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        // Complete this function
        int length = a.length;
        int sum = 0;
        String yes = "YES";
        String no = "NO";

        for(int i=0; i<length; ++i)
            sum += a[i];

        int rightSum = sum-a[0];
        int leftSum = 0;

        for(int i=0; i<length-1; ++i){

            if(leftSum == rightSum)
                return yes;

            leftSum += a[i];
            rightSum -= a[i+1];
        }

        if (leftSum == rightSum)
            return yes;

        return no;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}