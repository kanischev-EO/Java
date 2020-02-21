package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] charArray = string.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] == ' ') // если встречаешь пробел, тогда
                charArray[i] = Character.toUpperCase(charArray[i]); // переходи в следующюю ячейку и делай ей апперКейс метод
        }
        System.out.println(charArray);

        //напишите тут ваш код
    }
}
