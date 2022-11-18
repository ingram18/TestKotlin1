package com.tnp.testJava1;

import android.os.Build;

import com.tnp.testJava1.lottery.Game539;
import com.tnp.testkotlin1.school.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CountryJava {

    public static void main(String[] args) {

       // testDate1();

        //testDate2();
        //java8
        //testJava8Date();


        //testCallKotlin();

        Game539 game539 = new Game539();
        game539.testInt = 3;










    }

    private static void testCallKotlin() {
        Student stu = new Student("test1" , 10  ,30);
        System.out.println(Student.getPass()); //call static value
        stu.printData();
    }

    private static void testJava8Date() {
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

        System.out.println(formatter.format(now));
        LocalDateTime other = LocalDateTime.of(2022,3,12,13,2,33);
        System.out.println(other);
    }

    private static void testDate2() {
        //mutable
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("date1:" + date);
        calendar.set(Calendar.MONTH , 9);  // 0:January
        calendar.add(Calendar.DAY_OF_YEAR ,3 );
        date = calendar.getTime();
        System.out.println("date2:" + date);
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
