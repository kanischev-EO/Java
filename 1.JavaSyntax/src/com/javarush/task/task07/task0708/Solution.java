package com.javarush.task.task07.task0708;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int maxSizeStrings = 0;
        String valueMaxSizeStrings = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }
        for (String value : strings) {
            if (value.length() > maxSizeStrings) {
                maxSizeStrings = value.length();
                valueMaxSizeStrings = value;
            } else if (value.length() == maxSizeStrings) {
                valueMaxSizeStrings += "\n" + value;
            }
        }
        System.out.println(valueMaxSizeStrings);
    }
}

