package com.javarush.task.task02.task0216;


/*
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
       int min1, min2;
       if(a>b){
           min1 = b;
       }else min1 = a;
       if(min1 > c){
           min2 = c;
       }else min2 = min1;
       return min2;
    }

    public static void main(String[] args) {
        System.out.println(min(0, 1, -1));
        System.out.println(min(2, 1, 0));
        System.out.println(min(0, 0, 0));
        System.out.println(min(-1, 0, -2));
    }
}