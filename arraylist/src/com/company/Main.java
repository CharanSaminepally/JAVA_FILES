package com.company;
import java.util.ArrayList;

public class Main{

    public static void main (String[]  args){

        ArrayList<String> food = new ArrayList<String>();


        food.add("sushi");
        food.add("hamburger");
        food.add("pizza");

        food.set(0 , "coffee");


        for (int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
