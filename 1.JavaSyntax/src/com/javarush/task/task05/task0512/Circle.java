package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    int centreX, centerY, radius, width, color;
    public void initialize(int centreX, int centerY, int radius){
        this.centreX = centreX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centreX, int centerY, int radius, int width){
        this.centreX = centreX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int centreX, int centerY, int radius, int width, int color){
        this.centreX = centreX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
