package com.company;


public class  Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 25;

        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}