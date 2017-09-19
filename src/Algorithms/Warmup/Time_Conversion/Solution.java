package Algorithms.Warmup.Time_Conversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        if(s.contains("AM")){
            s = s.replace("AM", "");
            String[] timeArr = s.split(":");
            if(timeArr[0].equals("12")){
                timeArr[0] = "00";
            }
            s = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        else if(s.contains("PM")){
            s = s.replace("PM", "");
            String[] timeArr = s.split(":");
            if(!timeArr[0].equals("12")){
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
            }
            s = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);


    }
}
