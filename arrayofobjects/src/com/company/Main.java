package com.company;

public class Main{

    public static void main(String [] args){

        Food[] fridge = new Food[5];

        Food food1 = new Food("pizza");
        Food food2 = new Food("ham");
        Food food3 = new Food("chicken");

        fridge[0]= food1;
        fridge[1]= food2;
        fridge[2]= food3;

        System.out.println(fridge[0].name);


    }
    public static class Food{

        String name;
        Food(String name){
            this.name = name;
        }

    }
}
