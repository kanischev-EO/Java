package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in) );
        String name =bf.readLine();
        int y =Integer.parseInt(bf.readLine());
        int m =Integer.parseInt(bf.readLine());
        int d =Integer.parseInt(bf.readLine());
        System.out.println("Меня зовут " + name +".");
        System.out.print("Я родился " +  d+ "."+ m +"." + y);


    }
}
