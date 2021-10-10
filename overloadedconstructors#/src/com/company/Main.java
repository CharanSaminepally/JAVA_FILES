package com.company;

public class Main{

    public static void main(String[] args){


        Pizza pizza = new Pizza("ham","flakes","cream","butter");

        System.out.println(pizza.onion);

    }
    public static class Pizza {
        String bread;
        String onion;
        String sauce;
        String cheese;


        Pizza(String bread,String onion,String sauce,String cheese) {
            this.bread = bread;
            this.onion = onion;
            this.sauce = sauce;
            this.cheese = cheese;

        }


    }

}
