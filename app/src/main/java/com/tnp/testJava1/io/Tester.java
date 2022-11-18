package com.tnp.testJava1.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Tester {



    public static void main(String[] args) {



        /*try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
        } catch (IOException e) {

            e.printStackTrace();
        }*/

        //testFileInputStream();

        //testFileReader();


        //testBufferReader();


    }

    private static void testBufferReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataC.txt"));
            String in = br.readLine();
            while (in != null) {
                System.out.println(in);
                in = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testFileReader() {
        try {
            FileReader fr = new FileReader("dataC.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testFileInputStream() {



        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            int n = is.read(); //得到ascii
            while (n != -1) {
                System.out.println((char)n); //印出字元
                n = is.read();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
