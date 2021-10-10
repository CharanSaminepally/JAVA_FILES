package com.company;

public class Main{

    public static  void main(String[] args){

        car car1 = new car();

        car1.go();

    }
    public static abstract class vehicle{

        abstract void go();

    }
    public static class car extends vehicle{

        void go(){

            System.out.println("woahh!! the car is moving fast !!!");

        }

    }
}
