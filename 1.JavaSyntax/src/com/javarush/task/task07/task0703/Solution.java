package com.javarush.task.task07.task0703;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] words = new String[10];
        int[] value = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < words.length ; i++) {
            words[i] = bufferedReader.readLine();
            value[i] = words[i].length();
        }
        for (int i = 0; i < value.length ; i++) {
            System.out.println(value[i]);
        }
    }
}
