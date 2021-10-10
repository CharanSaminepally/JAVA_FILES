package com.company;

public class Main {

    public static void main(String[] args) {

        car car1 = new car("bmw");

        garage mygarage = new garage();

        garage.park(car1);


    }

    public static class garage {

        static void park(car car) {
            System.out.println("your " + car.name + " is parked in the garage!!!");


        }


    }

    public static class car {

        String name;

        car(String name) {
            this.name = name;
        }
    }

}