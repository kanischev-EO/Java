package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/


public class Solution {
    public static void main(String[] args) {//0
        method1();
    }

    public static String method1() {//1
        method2();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
//        for (int i = 0; i < elements.length ; i++) {
//            System.out.println(elements[i].getMethodName());
//        }
//        System.out.println("конец стека метода 1");
        return elements[2].getMethodName();
    }

    public static String method2() {//2
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
//        for (int i = 0; i < elements.length ; i++) {
//            System.out.println(elements[i].getMethodName());
//        }
//        System.out.println("конец стека метода 2");
        return elements[2].getMethodName();
    }

    public static String method3() {//3
        method4();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
//        for (int i = 0; i < elements.length ; i++) {
//            System.out.println(elements[i].getMethodName());
//        }
//        System.out.println("конец стека метода 3");
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
//        for (int i = 0; i < elements.length ; i++) {
//            System.out.println(elements[i].getMethodName());
//        }
//        System.out.println("конец стека метода 4");
        return elements[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements[2].getMethodName());
//        for (int i = 0; i < elements.length ; i++) {
//            System.out.println(elements[i].getMethodName());
//        }
//        System.out.println("конец стека метода 5");
        return elements[2].getMethodName();
    }
}
