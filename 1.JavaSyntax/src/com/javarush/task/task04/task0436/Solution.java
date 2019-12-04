package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int stroki =Integer.parseInt(bf.readLine());
        int stolbchi =Integer.parseInt(bf.readLine());
        for(int i=1;i<=stroki;i++){
            for(int j=1;j<stolbchi;j++){
                System.out.print("8");
            }
             System.out.println("8");
    }
}
}