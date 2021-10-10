package com.company;

public class Main {

    public static void main(String[] args) {

        car mycar = new car();

        System.out.println(mycar.model);
        System.out.println(mycar.price);



    }
    public static class car{

        String name = "ferrari";
        String model = "F1";
        int year = 2020;
        String colour = "red";
        double price = 20000000;

        void drive (){
            System.out.println("how's  the car going on !!! smooth right !!");
        }
        void brake(){
            System.out.println("ohhh! you applied the brakes !!!");
        }
    }
}
