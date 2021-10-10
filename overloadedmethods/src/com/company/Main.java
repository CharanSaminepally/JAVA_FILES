package com.company;

public class Main{

    public static void main (String[]  args){

        int x = add(1,2,3);
        System.out.println(x);


    }
    static int add (int a , int b){
        System.out.println("this is method #01");
        return a+b;
    }
    static int add (int a , int b ,int c){
        System.out.println("this is method #2");
        return a+b+c;
    }
    static int ad (int a, int b ,int c,int d){
        System.out.println("this is method #3");
        return a+b+c+d;
    }

}
