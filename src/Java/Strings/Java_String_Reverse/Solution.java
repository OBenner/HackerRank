package Java.Strings.Java_String_Reverse;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String string =sc.next();
        String reverse = new StringBuffer(string).reverse().toString();
        if(string.equals(reverse) == true) System.out.println("Yes");
        else System.out.println("No");

    }
}
