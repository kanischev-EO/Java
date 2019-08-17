package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bf.readLine());//2 2
        int b= Integer.parseInt(bf.readLine());//1 3
        int c= Integer.parseInt(bf.readLine());//3 1
        if((a>b && a<c) || (a<b && a>c)){
            System.out.print(a);
        }else if((b>a && b<c) || (b<a && b>c) ){
            System.out.println(b);
        }else if( (c>a && c<b) || (c<a && c>b)){
            System.out.println(c);
        }
        else if(a==c && c==b){
            System.out.print(a);
        }else if(a==b || b==c){
            System.out.print(b);
        }else if(a==c ||c==b){
            System.out.print(c);
        }
    }
}
