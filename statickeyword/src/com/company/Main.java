package com.company;

public class Main{

    public static void main (String[] args){

        friend friend1 = new friend("cedric");
        friend friend2 = new friend ("harry");
        friend friend3 = new friend ("luna");

        System.out.println(friend.numberoffriends);


    }
    public static class friend{


        String name ;
        static int numberoffriends;
        friend(String name){
            this.name = name;
            numberoffriends++;
        }
    }
}
