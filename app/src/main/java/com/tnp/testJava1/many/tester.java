package com.tnp.testJava1.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class tester {

    public static void main(String[] args) {
        //arrayTest();

        //listTest();

        //setTest();

        Map<String, String > stocks = new HashMap<>();
        stocks.put("2330" , "台積電");

        stocks.put("2317" , "鴻海");
        stocks.put("2330" , "TSMC");
        System.out.println(stocks.get("2330"));

        System.out.println(stocks);

        //得到所有value方法
        for (String key : stocks.keySet()
             ) {
            System.out.println(stocks.get(key));
        }



    }

    private static void setTest() {
        Set<Integer> a = new HashSet<>();
        a.add(9);
        a.add(17);
        a.add(8);
        a.add(17);

        for (int b : a
             ) {
            System.out.println(b);
        }
    }

    private static void listTest() {
        ArrayList list = new ArrayList(); //可以不指定放的類型
        list.add(5);
        int n1 = (int)list.get(0);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        System.out.println(list.size());

        List<Integer> list2 =  Arrays.asList(5,3,2,1,4);

        for (int number: list2
             ) {
            System.out.println(number);
        }
    }

    private static void arrayTest() {
        int[] number = new int[5];
        int[] scores = {20,30,40,50};

        System.out.println(scores);

        int total = 0;

        //foreach
        for (int i: scores
             ) {

            System.out.print(i + " ");

            total += i;

        }


        System.out.println("total:" + total);
    }


}
