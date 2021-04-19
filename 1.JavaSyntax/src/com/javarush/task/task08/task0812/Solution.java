package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> countReplay = new ArrayList<>();

        int count = 1;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10 ; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < integers.size()-1; i++) {
            if(integers.get(i)== integers.get(i+1)){
                count++;
            }else { countReplay.add(count);
            count=1;
            }
        }
        System.out.println(Collections.max(countReplay));


    }
}
