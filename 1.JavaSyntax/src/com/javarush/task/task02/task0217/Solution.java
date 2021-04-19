package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int min1;
        if(min(a, b)>min(c, d)){
            min1 = min(c, d);
        }else
            min1 = min(a, b);
        return min1;


    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int c;
        if (a>b) c = b;
        else c = a;
        return c;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(0, 1, 2, 3));
        System.out.println(min(-1, 2, 1, 2));
        System.out.println(min(-1, -2, -3, -4));
        System.out.println(min(1, 0, -1, -2));
    }
}