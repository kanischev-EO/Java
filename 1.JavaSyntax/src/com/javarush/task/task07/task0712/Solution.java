package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int lenghtMaxString = 0;
        int indexMaxString = 0;
        int lenghtMinString = 0;
        int indexMinString = 0;
        String valueMaxString = null;
        String valueMinString = null;

        for (int i = 0; i < 10 ; i++) {
            list.add(bufferedReader.readLine());
        }
        for (String value: list) {
            if(value.length() > lenghtMaxString ){
                lenghtMaxString = value.length();
                indexMaxString =list.indexOf(value);
                valueMaxString = value;
            }else if ( value.length() < lenghtMinString || lenghtMinString == 0){
                lenghtMinString = value.length();
                indexMinString = list.indexOf(value);
                valueMinString = value;
            }
        }
        String enter = indexMaxString > indexMinString ? valueMinString : valueMaxString;
        System.out.println(enter);

    }
}
