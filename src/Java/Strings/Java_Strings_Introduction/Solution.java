package Java.Strings.Java_Strings_Introduction;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l = A.length()+B.length();
        System.out.println(l);
        if (A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }
        else System.out.println("No");
        System.out.println( A.substring(0, 1).toUpperCase() + A.substring(1) + " "+
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
