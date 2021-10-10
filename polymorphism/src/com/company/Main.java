package com.company;
public class Main{

    public static void main(String[] args){

        car car = new car();
        cycle cycle = new cycle();
        bike bike = new bike();

        vehicle [] racers = {car,cycle , bike};

        for (vehicle x : racers){
            x.go();

        }
    }
    public static class vehicle{
        void go(){

        }
    }
    public static class car extends vehicle{

        @Override
        public void go(){
            System.out.println("the car is moving !");
        }

    }
    public static class cycle extends vehicle{

        @Override
        public void go(){
            System.out.println("the cycle is moving !");
        }
    }
    public static class bike extends vehicle{
        @Override
        public void go(){
            System.out.println("the bike is moving!");
        }
    }
}
