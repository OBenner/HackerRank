package Algorithms.Sorting.Intro_to_Tutorial_Challenges;
import java.util.Scanner;

public class Intro_to_Tutorial_Challenges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(v==a[i]){
                System.out.println(i);
            }
        }
    }
}
