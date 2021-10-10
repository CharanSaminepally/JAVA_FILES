package com.company;
import java.util.ArrayList;

public class Main{

    public static void main (String[]  args){

        ArrayList<ArrayList<String>> mylist = new ArrayList ();

        ArrayList<String> food = new ArrayList<String>();

        food.add("sushi");
        food.add("hamburger");
        food.add("pizza");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("benz");
        cars.add("bmw");

        mylist.add(food);
        mylist.add(cars);

        System.out.println(mylist);
    }
}
