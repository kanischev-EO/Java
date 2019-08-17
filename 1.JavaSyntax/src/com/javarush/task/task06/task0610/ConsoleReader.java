package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readStr = reader.readLine();
        return readStr;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readIn = Integer.parseInt(reader.readLine());
        return readIn;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader .readLine();
        double readDob = Double.parseDouble(read);
        return readDob;


    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readb = reader.readLine();
        boolean readBool = Boolean.parseBoolean(readb);
        return  readBool;

    }

    public static void main(String[] args) throws Exception {

    }
}
