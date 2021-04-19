package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = bufferedReader.readLine();
        return value;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bufferedReader.readLine());
        return value;
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double value = Double.parseDouble(bufferedReader.readLine());
        return value;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean value = Boolean.parseBoolean(bufferedReader.readLine());
        return value;

    }

    public static void main(String[] args) throws Exception {

    }
}
