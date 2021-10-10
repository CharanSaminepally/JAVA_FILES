package com.company;

public class Main{

    public static void main (String [] args ){

        dog dog = new dog();

        dog.speak();



    }
    public static class animal {

        void speak(){

            System.out.println("the animal is speaking!!!");
        }


    }
    public static class dog extends animal{

        void speak(){
            //override
            System.out.println("the dog barks !!!!!!****");
        }



    }
}
