package com.company;

public class Main{

    public static void main(String [] args){


        cycle hercules = new cycle();

        hercules.go();
    }
    public static class vehicle{

        double speed;

        void go(){

            System.out.println("you are moving");
        }
        void stop(){

            System.out.println("you are stopped!");
        }


    }

    public static class cycle extends vehicle{

    }

    public static class car extends vehicle{

    }
}
