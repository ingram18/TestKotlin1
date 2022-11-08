package com.tnp.testJava1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountryJava {

    public static void main(String[] args) {

        testDate1();


    }

    private static void testDate1() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");

        System.out.println(sdf.format(date));

        String time = "2022/11/08  17:30:55";
        Date otherDate = null;
        try {
            otherDate = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(otherDate);
    }


}
