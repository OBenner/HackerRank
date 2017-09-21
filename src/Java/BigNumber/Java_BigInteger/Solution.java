package Java.BigNumber.Java_BigInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger one = new BigInteger(scan.next());
        BigInteger two = new BigInteger(scan.next());
        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}