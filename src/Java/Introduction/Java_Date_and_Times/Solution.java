package Java.Introduction.Java_Date_and_Times;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static String getDay(String day, String month, String year) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date t;
        String d = null;
        try {
            t = ft.parse(year + "-" + month + "-" + day);
            ft.applyPattern("EEEE");
            d = ft.format(t);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d.toUpperCase();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }


}